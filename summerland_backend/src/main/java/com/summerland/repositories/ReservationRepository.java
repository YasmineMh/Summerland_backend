package com.summerland.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.summerland.entities.House;
import com.summerland.entities.Reservation;

public interface ReservationRepository  extends JpaRepository<Reservation, Long>{

	@Query("select r from Reservation r where r.house.id=:x ORDER BY r.id DESC")
	ArrayList<Reservation> findReservationsByHouseId(@Param("x") Long id);

	@Query("select r from Reservation r  where r.confirmation like 'confirmer' and r.house.id=:x")
	ArrayList<Reservation> findConfirmedHouses(@Param("x") Long id);

	@Query("select r from Reservation r  where r.confirmation like 'attendre' and r.house.id=:x")
	ArrayList<Reservation> findWaitingHouses(@Param("x") Long id);

}//like %:x%
