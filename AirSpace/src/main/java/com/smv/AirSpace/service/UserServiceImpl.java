package com.smv.AirSpace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smv.AirSpace.dto.AirlineDTO;
import com.smv.AirSpace.dto.HotelDTO;
import com.smv.AirSpace.model.Address;
import com.smv.AirSpace.model.Airline;
import com.smv.AirSpace.model.Hotel;
import com.smv.AirSpace.model.Location;
import com.smv.AirSpace.model.User;
import com.smv.AirSpace.model.UserStatus;
import com.smv.AirSpace.model.UserType;
import com.smv.AirSpace.repository.AirlineRepository;
import com.smv.AirSpace.repository.HotelRepository;
import com.smv.AirSpace.repository.LocationRepository;
import com.smv.AirSpace.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@Autowired
	private AirlineRepository airlineRepository;
	
	@Autowired
	private LocationRepository locationRepository;
	//@Autowired
	//private PasswordEncoder passwordEncoder;
	
	public boolean saveAdmin(User user) {
		try {
			userRepository.save(user);
		} catch (Exception e) {
			return false;
		}
		System.out.println("yes");
		return true;
		
	}
	
	@Override

	public boolean saveAdmin(String username, UserType userType) {

		if (username == null || userType == null)

			return false;

		if (username == "")

			return false;



		if (existsUsername(username))

			return false;

		if (userType == UserType.REGISTERED_USER)

			return false;
		
		
		User user = new User(username,"admin", userType, UserStatus.PENDING);

		try {

			userRepository.save(user);

		} catch (Exception e) {

			return false;

		}



		return true;

	}
	
	public boolean existsUsername(String username) {

		User user = userRepository.findByUsername(username);

		return user != null;
	}
	
	public boolean existsHotelName(String name) {

		Hotel hotel = hotelRepository.findByName(name);

		return hotel != null;
	}
	

	public boolean existsAirlineName(String name) {

		Airline airline = airlineRepository.findByName(name);

		return airline != null;
	}
	

	@Override
	public boolean saveHotel(HotelDTO hotelDTO) {
		if (hotelDTO.getName() == "" ||  existsHotelName(hotelDTO.getName())) {
			System.out.println("s");
			return false;
		}
		Hotel hotel = new Hotel(hotelDTO);
		Address address = new Address(hotelDTO.getStreet(),hotelDTO.getCity(), hotelDTO.getState());
		Location location = new Location(address);
		hotel.setLocation(location);
		hotelRepository.save(hotel);
		return true;
		
	}

	@Override
	public boolean saveAirline(AirlineDTO airlineDTO) {
		
		if (airlineDTO.getName() == "" ||  existsAirlineName(airlineDTO.getName())) return false;
		
		Airline airline = new Airline(airlineDTO);
		airlineRepository.save(airline);
		return true;
		
	}
	
	



}
