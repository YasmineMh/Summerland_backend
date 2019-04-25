package com.summerland.business;

import java.util.ArrayList;

import com.summerland.entities.House;
import com.summerland.entities.Reservation;

public interface IBusinessReservation {

	ArrayList<Reservation> listReservationsOfHouse(Long id);
	
	ArrayList<Reservation> listHouses_confirmer(Long id);
	
	ArrayList<Reservation> listHouses_attendre(Long id);
}
