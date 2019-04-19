package com.smv.AirSpace.service;

import com.smv.AirSpace.dto.*;
import com.smv.AirSpace.model.User;
import com.smv.AirSpace.model.UserType;


public interface UserService {
	public User saveUser(UserDTO userDTO);
	
	public boolean saveAdmin(User user);
		
	public boolean saveHotel(HotelDTO hotelDTO);

	public boolean saveAirline(AirlineDTO airlineDTO);

	public boolean saveRentacar(RentacarDTO rentacarDTO);

	public boolean saveAdmin(String username, String email, UserType userType, Long companyId);
	
	public Long findCompanydId(String name, UserType userType);

	public boolean update(RegisterUserEditDTO registerUserEditDTO);

}
