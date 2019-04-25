package com.summerland.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.summerland.entities.Place;
import com.summerland.repositories.OwnerRepository;
import com.summerland.repositories.PlaceRepository;

@Service
@Transactional
public class ImplBusinessPlace implements IBusinessPlace {

	
	@Autowired
	private PlaceRepository placeRepository;
	
	@Override
	public void savePlace(Place place) {
		
		placeRepository.save(place);
	}

}
