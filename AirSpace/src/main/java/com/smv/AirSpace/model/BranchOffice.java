package com.smv.AirSpace.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "branchoffice")
public class BranchOffice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String officeName;
    @OneToOne(fetch = FetchType.EAGER)
	private Location location;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="branchoffice")
	private List<Vehicle> vehicles;
    @ManyToOne()
    private Rentacar rentacar;

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
