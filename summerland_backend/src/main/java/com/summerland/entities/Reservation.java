package com.summerland.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "reservations")
public class Reservation {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String confirmation;

	@ManyToOne
	@JoinColumn(name="CUSTOMER")
	private Customer customer;
	

	@ManyToOne
	@JoinColumn(name="HOUSE")
	private House house;

	public Reservation() {
		super();
	}


	public Reservation(String confirmation, Customer customer, House house) {
		super();
		this.confirmation = confirmation;
		this.customer = customer;
		this.house = house;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public House getHouse() {
		return house;
	}


	public void setHouse(House house) {
		this.house = house;
	}


}
