package com.smv.AirSpace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smv.AirSpace.model.User;
import com.smv.AirSpace.service.UserServiceImpl;


@RestController
@RequestMapping(value = "/sys_admin")

public class SysAdminContoller {
	
	@Autowired
	UserServiceImpl userService;
	
	@RequestMapping(value = "/add_system_admin", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> saveSysAdmin(@RequestBody User user){
		boolean success = true;
		
		success = userService.saveAdmin(user);
		
		
		return new ResponseEntity<Boolean>(success, HttpStatus.OK);
	}

}
