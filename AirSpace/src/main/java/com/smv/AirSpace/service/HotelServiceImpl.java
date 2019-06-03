package com.smv.AirSpace.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smv.AirSpace.dto.RoomDTO;
import com.smv.AirSpace.model.Hotel;
import com.smv.AirSpace.model.Room;
import com.smv.AirSpace.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelRepository hotelRepository;
	
	@Autowired
	UserService userService;
	
	@Override
	public boolean saveRoom(RoomDTO roomDTO) {
		Hotel hotel = hotelRepository.findByName("dash");
		Room room = new Room(roomDTO);
		hotel.getRooms().add(room);
		Hotel savedHotel = hotelRepository.save(hotel);
		if (savedHotel != null) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

	@Override
	public List<String> getAllNames() {
		return hotelRepository.getAllNames();
	}

	@Override
	public List<Room> getRooms() {
		//User user  = userService.getLoggedUser();
		//Hotel hotel = hotelRepository.findById(user.getCompanyId());
		List<Room> rooms = new ArrayList<>();
		Hotel hotel = hotelRepository.findByName("dash");
		rooms = hotel.getRooms();
		return rooms;
	}
	
	@Override
	public List<Room> getRoomsShow(String name) {
		//User user  = userService.getLoggedUser();
		//Hotel hotel = hotelRepository.findById(user.getCompanyId());
		List<Room> rooms = new ArrayList<>();
		Hotel hotel = hotelRepository.findByName(name);
		rooms = hotel.getRooms();
		return rooms;
	}
	
	

	@Override
	public Hotel findByName(String name) {
		return hotelRepository.findByName(name);
	}

	@Override
	public Hotel findById(long id) {
		return hotelRepository.findById(id);
	}
	
	@Override
	public List<Hotel> searchByName(String name) {
		List<Hotel> hotels = new ArrayList<>();
		for (Hotel c : hotelRepository.findAll()) {
			if (c.getName().toLowerCase().contains(name.toLowerCase())) {
				hotels.add(c);
			}
		}
		return hotels;
	}

	



	
	
	

}
