package com.summerland.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.summerland.entities.Owner;

public interface OwnerRepository  extends JpaRepository<Owner, Long>{

}
