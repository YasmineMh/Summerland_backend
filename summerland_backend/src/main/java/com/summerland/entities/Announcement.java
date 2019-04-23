package com.summerland.entities;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "announcement")
public class Announcement {

	@Id
    @GeneratedValue
	private Long id;
	private Date date_init;
	private Date date_final;
	private double discount;
	
	@ManyToOne
	@JoinColumn(name="HOUSE")
	private House house;
	
	@OneToMany(mappedBy="announcement",fetch=FetchType.LAZY)
	private Collection<Reservation> reservations;

	public Announcement() {
		super();
	}

	public Announcement(Date date_init, Date date_final, double discount, House house) {
		super();
		this.date_init = date_init;
		this.date_final = date_final;
		this.discount = discount;
		this.house = house;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate_init() {
		return date_init;
	}

	public void setDate_init(Date date_init) {
		this.date_init = date_init;
	}

	public Date getDate_final() {
		return date_final;
	}

	public void setDate_final(Date date_final) {
		this.date_final = date_final;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public Collection<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}

	
	
	
	
	
}
