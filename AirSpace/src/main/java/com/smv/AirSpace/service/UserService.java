package com.smv.AirSpace.service;

import com.smv.AirSpace.dto.AirlineDTO;
import com.smv.AirSpace.dto.HotelDTO;
import com.smv.AirSpace.dto.RentacarDTO;
import com.smv.AirSpace.model.User;
import com.smv.AirSpace.model.UserType;


public interface UserService {
	
	public boolean saveAdmin(User user);
		
	public boolean saveHotel(HotelDTO hotelDTO);

	public boolean saveAirline(AirlineDTO airlineDTO);

	public boolean saveRentacar(RentacarDTO rentacarDTO);

	public boolean saveAdmin(String username, String email, UserType userType, Long companyId);
	
	public Long findCompanydId(String name, UserType userType);

}
