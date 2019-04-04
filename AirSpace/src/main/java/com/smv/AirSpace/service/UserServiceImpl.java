package com.smv.AirSpace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smv.AirSpace.dto.AirlineDTO;
import com.smv.AirSpace.dto.HotelDTO;
import com.smv.AirSpace.dto.RentacarDTO;
import com.smv.AirSpace.model.Address;
import com.smv.AirSpace.model.Airline;
import com.smv.AirSpace.model.Hotel;
import com.smv.AirSpace.model.Location;
import com.smv.AirSpace.model.Rentacar;
import com.smv.AirSpace.model.User;
import com.smv.AirSpace.model.UserStatus;
import com.smv.AirSpace.model.UserType;
import com.smv.AirSpace.repository.AirlineRepository;
import com.smv.AirSpace.repository.HotelRepository;
import com.smv.AirSpace.repository.RentacarRepository;
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
	private RentacarRepository rentacarRepository;
	
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
	

	public boolean existsRentacarName(String name) {

		Rentacar rentacar = rentacarRepository.findByName(name);

		return rentacar != null;
	}
	

	@Override
	public boolean saveHotel(HotelDTO hotelDTO) {
		if (hotelDTO.getName() == "" ||  existsHotelName(hotelDTO.getName())) {
			System.out.println("s");
			return false;
		}
		Hotel hotel = new Hotel(hotelDTO);
		Location location = locationSetter(hotelDTO.getStreet(),hotelDTO.getCity(), hotelDTO.getState());
		hotel.setLocation(location);
		hotelRepository.save(hotel);
		return true;
		
	}

	public Location locationSetter(String street, String city, String state) {
		Address address = new Address(street, city, state);
		Location location = new Location(address);
		return location;
	}
	
	@Override
	public boolean saveAirline(AirlineDTO airlineDTO) {
		
		if (airlineDTO.getName() == "" ||  existsAirlineName(airlineDTO.getName())) return false;
		if (airlineDTO.getStreet() == null || airlineDTO.getCity() == null || airlineDTO.getState() == null) return false;

		
		Location location = locationSetter(airlineDTO.getStreet(),airlineDTO.getCity(), airlineDTO.getState());
		Airline airline = new Airline(airlineDTO);
		airline.setLocation(location);
		airlineRepository.save(airline);
		return true;
		
	}

	@Override
	public boolean saveRentacar(RentacarDTO rentacarDTO) {

		if (rentacarDTO.getName() == "" ||  existsRentacarName(rentacarDTO.getName())) return false;
		
		if (rentacarDTO.getStreet() == null || rentacarDTO.getCity() == null || rentacarDTO.getState() == null) return false;
		
		Location location = locationSetter(rentacarDTO.getStreet(),rentacarDTO.getCity(), rentacarDTO.getState());
		Rentacar rentacar = new Rentacar(rentacarDTO);
		rentacar.setLocation(location);
		rentacarRepository.save(rentacar);
		return true;
	}
	
	



}