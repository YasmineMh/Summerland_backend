package com.summerland.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.summerland.entities.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{

}
