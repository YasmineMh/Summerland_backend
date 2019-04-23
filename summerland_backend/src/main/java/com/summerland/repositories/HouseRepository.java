package com.summerland.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.summerland.entities.House;

public interface HouseRepository  extends JpaRepository<House, Long>{

	
}
