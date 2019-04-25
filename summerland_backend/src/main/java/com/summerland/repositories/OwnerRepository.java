package com.summerland.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.summerland.entities.House;
import com.summerland.entities.Owner;

public interface OwnerRepository  extends JpaRepository<Owner, Long>{



}
