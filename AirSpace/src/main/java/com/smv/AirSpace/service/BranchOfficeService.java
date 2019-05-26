package com.smv.AirSpace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smv.AirSpace.repository.BranchOfficeRepository;

import exceptions.BranchOfficeDoesntExist;

@Service
public class BranchOfficeService {
	
	@Autowired
	BranchOfficeRepository branchOfficeRepository;
	
	public void delete(Long id) {
		System.out.println("Ovo je id" + id);
		try {
			branchOfficeRepository.deleteById(id);
		} catch (Exception e) {
			throw new BranchOfficeDoesntExist();
		}
	}
	

}
