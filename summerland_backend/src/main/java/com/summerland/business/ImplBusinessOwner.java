package com.summerland.business;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.summerland.entities.Owner;
import com.summerland.repositories.AnnouncementRepository;
import com.summerland.repositories.OwnerRepository;

@Service
@Transactional
public class ImplBusinessOwner implements IBusinessOwner{

	@Autowired
	private OwnerRepository ownerRepository;
	
	@Override
	public ArrayList<Owner> getOwner() {
		return (ArrayList<Owner>) ownerRepository.findAll();
	}

}
