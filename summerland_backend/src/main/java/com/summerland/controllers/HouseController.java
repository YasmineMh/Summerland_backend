package com.summerland.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.summerland.entities.Announcement;
import com.summerland.entities.Customer;
import com.summerland.entities.House;
import com.summerland.entities.Owner;
import com.summerland.business.IBusinessAnnouncement;
import com.summerland.business.IBusinessCustomer;
import com.summerland.business.IBusinessHouse;
import com.summerland.business.IBusinessOwner;

@RestController
public class HouseController {
	
	@Autowired
	private IBusinessHouse houseTreatment;
	@Autowired
	private IBusinessAnnouncement announcementTreatment;
	@Autowired
	private IBusinessOwner ownerTreatment;
	@Autowired
	private IBusinessCustomer customerTreatment;
	
	@RequestMapping(value = "/gethouses")
	public ArrayList<House> getHouses() {
		return houseTreatment.getHouses();
	}
	
	@RequestMapping(value = "/getannouncements")
	public ArrayList<Announcement> getAnnouncement() {
		return announcementTreatment.getAnnouncement();
	}
	
	@RequestMapping(value = "/getowners")
	public ArrayList<Owner> getOwner() {
		return ownerTreatment.getOwner();
	}
	
	@RequestMapping(value = "/getcustmers")
	public ArrayList<Customer> getCustomer() {
		return customerTreatment.getCustomer();
	}
	
	@RequestMapping(value = "/savehouse", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveHouse(@RequestBody House house) {
		System.out.println("saving house ..");
        houseTreatment.saveHouse(house);
    }
	

	
	@RequestMapping(value = "/getString")
    public void getString(@RequestBody String str) {
		System.out.println(str);
    }
}
