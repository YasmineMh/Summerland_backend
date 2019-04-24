package com.summerland.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "houses")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class House {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String address;
	private String description;
	private double surface;
	private boolean seaview;
	private int age;
	private double price;
	private int rooms_number;
	
	@Lob
	private Byte[] image;
	
	@Lob
    private Collection<byte[]> images;
	
	@ManyToOne
	@JoinColumn(name="PLACE")
	private Place place;
	

	@ManyToOne
	@JoinColumn(name="OWNER")
	private Owner owner;
	
	@OneToMany(mappedBy="house",fetch=FetchType.LAZY)
	@JsonIgnore
	@Cascade(CascadeType.ALL)
	private Collection<Review> reviews;
	
	@OneToMany(mappedBy="house",fetch=FetchType.LAZY)
	@JsonIgnore
	@Cascade(CascadeType.ALL)
	private Collection<Reaction> reactions;
	

	@OneToMany(mappedBy="house",fetch=FetchType.LAZY)
	@JsonIgnore
	@Cascade(CascadeType.ALL)
	private Collection<Announcement> announcement;
	
	public House() {
		super();
	}
	
	

	public House(String address, String description, double surface, boolean seaview, int age, double price,
			int rooms_number, Place place) {
		super();
		this.address = address;
		this.description = description;
		this.surface = surface;
		this.seaview = seaview;
		this.age = age;
		this.price = price;
		this.rooms_number = rooms_number;
		this.place = place;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	public boolean isSeaview() {
		return seaview;
	}

	public void setSeaview(boolean seaview) {
		this.seaview = seaview;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRooms_number() {
		return rooms_number;
	}

	public void setRooms_number(int rooms_number) {
		this.rooms_number = rooms_number;
	}

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

	public Collection<byte[]> getImages() {
		return images;
	}

	public void setImages(Collection<byte[]> images) {
		this.images = images;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Collection<Review> reviews) {
		this.reviews = reviews;
	}

	public Collection<Reaction> getReactions() {
		return reactions;
	}

	public void setReactions(Collection<Reaction> reactions) {
		this.reactions = reactions;
	}

	public Collection<Announcement> getAnnouncement() {
		return announcement;
	}

	public void setAnnouncement(Collection<Announcement> announcement) {
		this.announcement = announcement;
	}




	
	
	
}
