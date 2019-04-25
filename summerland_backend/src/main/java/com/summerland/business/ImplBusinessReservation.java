package com.summerland.business;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.summerland.entities.House;
import com.summerland.entities.Reservation;
import com.summerland.repositories.HouseRepository;
import com.summerland.repositories.ReservationRepository;

@Service
@Transactional
public class ImplBusinessReservation implements IBusinessReservation{

	@Autowired
	private ReservationRepository reservationRepository;
	
	@Override
	public ArrayList<Reservation> listReservationsOfHouse(Long id) {
		ArrayList<Reservation> res = reservationRepository.findReservationsByHouseId(id);
		return res;
	}
	

	@Override
	public ArrayList<Reservation> listHouses_confirmer(Long id) {
		ArrayList<Reservation> res = reservationRepository.findConfirmedHouses(id);
		return res;
	}

	@Override
	public ArrayList<Reservation> listHouses_attendre(Long id) {
		ArrayList<Reservation> res = reservationRepository.findWaitingHouses(id);
		return res;
	}
	

	
}
