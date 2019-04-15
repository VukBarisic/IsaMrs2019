package com.smv.AirSpace.service;

import java.util.List;

import com.smv.AirSpace.model.Hotel;

public interface HotelService {
	
	public void saveHotel();
	public List<Hotel> getAll();
	public List<String> getAllNames();


}
