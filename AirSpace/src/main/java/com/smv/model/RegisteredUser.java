package com.smv.model;

import java.util.List;

public class RegisteredUser extends User {
	
	protected String name;
	protected String surname;
	protected Address address;
	protected List<RegisteredUser> friendsList;

}
