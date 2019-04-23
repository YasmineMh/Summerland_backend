package com.summerland.business;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.summerland.entities.House;
import com.summerland.repositories.HouseRepository;

@Service
@Transactional
public class ImplBusinessHouse implements IBusinessHouse{

	@Autowired
	private HouseRepository houseRepository;
	
	//get all the houses
	public  ArrayList<House> getHouses() {
		
		return (ArrayList<House>) houseRepository.findAll();
	}

	@Override
	public void saveHouse(House house) {
		houseRepository.save(house);
	}

}
