package com.summerland.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.summerland.entities.Customer;
import com.summerland.entities.House;
import com.summerland.entities.Owner;
import com.summerland.business.IBusinessCustomer;
import com.summerland.business.IBusinessHouse;
import com.summerland.business.IBusinessOwner;
import com.summerland.business.IBusinessPlace;

@RestController
public class HouseController {
	
	@Autowired
	private IBusinessHouse houseTreatment;
	@Autowired
	private IBusinessOwner ownerTreatment;
	@Autowired
	private IBusinessCustomer customerTreatment;
	@Autowired
	private IBusinessPlace placeTreatment;
	
	@RequestMapping(value = "/gethouses")
	public ArrayList<House> getHouses() {
		return houseTreatment.getHouses();
	}

	@RequestMapping(value = "/getowners")
	public ArrayList<Owner> getOwner() {
		return ownerTreatment.getOwner();
	}
	
	@RequestMapping(value = "/getcustmers")
	public ArrayList<Customer> getCustomer() {
		return customerTreatment.getCustomer();
	}
	
	@RequestMapping(value = "/savehouse", method = RequestMethod.POST)
    public void saveHouse(@ModelAttribute House house) {
		System.out.println("saving house ..");
		
        houseTreatment.saveHouse(house);
    }
	



	/*@RequestMapping(value = "/getString")
    public void getString() {
		Owner o=new Owner("mtibaa.amall@gmail.com","123","Amal","Mtibaa","93750292","doesn't matter",null);
		ownerTreatment.saveOwner(o);

		House h=new House("Villa house in Marsa","marsa 23, cité les pins","bla bla",102,true,23,1500,"week",5,2,3,"villa",null,null,null,o,null,null);
		houseTreatment.saveHouse(h);
    }*/
}
