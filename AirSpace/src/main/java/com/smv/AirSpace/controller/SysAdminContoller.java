package com.smv.AirSpace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smv.AirSpace.dto.AirlineDTO;
import com.smv.AirSpace.dto.HotelDTO;
import com.smv.AirSpace.dto.RentacarDTO;
import com.smv.AirSpace.dto.UserDTO;
import com.smv.AirSpace.service.UserService;


@RestController
@RequestMapping(value = "/sys_admin")

public class SysAdminContoller {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/add_system_admin", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> addSysAdmin(@RequestBody UserDTO userDTO) {
		 try {
	
	    	boolean retValue = userService.saveAdmin(userDTO.getUsername(), userDTO.getUserType());
	
		    if (retValue) return new ResponseEntity<Boolean>(retValue, HttpStatus.CREATED);
	
		    return new ResponseEntity<Boolean>(retValue, HttpStatus.OK);
	
		 }
		
		 catch (Exception e) {
		
			 return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
			        }
		}
	
	
	 @RequestMapping(value = "/add_admin", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Boolean> add(@RequestBody UserDTO userDTO) {
	        try{
	        	boolean retValue = userService.saveAdmin(userDTO.getUsername(), userDTO.getEmail(),userDTO.getUserType(), userDTO.getCompanyId());
	        	if (retValue) return new ResponseEntity<Boolean>(retValue, HttpStatus.CREATED);
	        	return new ResponseEntity<Boolean>(retValue, HttpStatus.OK);
	        }
	        catch (Exception e) {
	            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
	        }

	    }

	
	
	
	
	@RequestMapping(value = "/add_hotel", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> addHotel(@RequestBody HotelDTO hotelDTO) {
		 try {
				
		    	boolean retValue = userService.saveHotel(hotelDTO);
		
			    if (retValue) return new ResponseEntity<Boolean>(retValue, HttpStatus.CREATED);
		
			    return new ResponseEntity<Boolean>(retValue, HttpStatus.OK);
		
			 }
			
			 catch (Exception e) {
			
				 return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
				        }
			}

@RequestMapping(value = "/add_airline", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Boolean> addAirline(@RequestBody AirlineDTO airlineDTO) {
	 try {
			
	    	boolean retValue = userService.saveAirline(airlineDTO);
	
		    if (retValue) return new ResponseEntity<Boolean>(retValue, HttpStatus.CREATED);
	
		    return new ResponseEntity<Boolean>(retValue, HttpStatus.OK);
	
		 }
		
		 catch (Exception e) {
		
			 return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
			        }
		}

	@RequestMapping(value = "/add_rentacar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> addRentacar(@RequestBody RentacarDTO rentacarDTOD) {
		 try {
				
		    	boolean retValue = userService.saveRentacar(rentacarDTOD);
		
			    if (retValue) return new ResponseEntity<Boolean>(retValue, HttpStatus.CREATED);
		
			    return new ResponseEntity<Boolean>(retValue, HttpStatus.OK);
		
			 }
			
			 catch (Exception e) {
			
				 return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
				        }
			} 
		
}
