package com.smv.AirSpace.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smv.AirSpace.dto.RoomDTO;
import com.smv.AirSpace.model.Hotel;
import com.smv.AirSpace.model.Room;
import com.smv.AirSpace.service.HotelService;

@RestController
@RequestMapping(value = "/hotel_admin")
public class HotelAdminController {
	
	@Autowired
	HotelService hotelService;
	


	@RequestMapping(value = "/add_room", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> addRoom(@RequestBody RoomDTO roomDTO) {
		try {

			boolean retValue = hotelService.saveRoom(roomDTO);

			if (retValue)
				return new ResponseEntity<Boolean>(retValue, HttpStatus.CREATED);

			return new ResponseEntity<Boolean>(retValue, HttpStatus.OK);

		}

		catch (Exception e) {

			return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
		}
	}
	

	@RequestMapping(value = "/get_rooms/{name}", method = RequestMethod.GET)
	public ResponseEntity<List<RoomDTO>> getRooms(@PathVariable("name") String hotelName) {
		Hotel hotel = hotelService.findByName(hotelName);
		List<Room> rooms = new ArrayList<>();
		List<RoomDTO> roomDTOs = new ArrayList<>();
		try {
			rooms = hotel.getRooms();
			if (rooms != null) {
				roomDTOs = Helpers.Converter.convertRoomToRoomDTO(rooms);
				return new ResponseEntity<List<RoomDTO>>(roomDTOs, HttpStatus.OK);
			}
			return new ResponseEntity<List<RoomDTO>>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<List<RoomDTO>>(HttpStatus.BAD_REQUEST);
		}
	}
	
	

}
