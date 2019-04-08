package com.smv.AirSpace.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    protected Long id;
    protected String username;
    protected String password;
    protected String email;
	@Enumerated(EnumType.ORDINAL)
    protected UserStatus userStatus;
	@Enumerated(EnumType.ORDINAL)
    protected UserType userType;
	protected Long companyId;



	public User(){

    }


    public User(String username, String password, String email, UserStatus userStatus, UserType userType) {
        super();
    	this.username = username;
        this.password = password;
        this.email = email;
        this.userStatus = userStatus;
        this.userType = userType;
    }

    public User(String username, String password, UserType userType, UserStatus userStatus) {
    	this.username = username;
        this.password = password;
        this.userStatus = userStatus;
        this.userType = userType;
	}


	public User(String username, String password, String email, UserType userType, UserStatus userStatus, Long companyId) {
		this.username = username;
		this.email = email;
		this.password = password;
        this.userStatus = userStatus;
        this.userType = userType;
        this.companyId = companyId;
        }


	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    

    public Long getCompanyId() {
		return companyId;
	}


	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}
