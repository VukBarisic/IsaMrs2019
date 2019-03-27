package com.smv.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "branchoffce")
public class BranchOffice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String officeName;
	private Location location;
	private List<Vehicle> vehicles;

	public BranchOffice(){

	}


	public BranchOffice(Long id, String officeName, Location location, List<Vehicle> vehicles) {
		this.id = id;
		this.officeName = officeName;
		this.location = location;
		this.vehicles = vehicles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
}
