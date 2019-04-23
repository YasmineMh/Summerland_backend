package com.summerland.business;

import java.util.ArrayList;

import com.summerland.entities.House;

public interface IBusinessHouse {
	public ArrayList<House> getHouses();

	public void saveHouse(House house);
}
