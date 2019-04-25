package com.summerland.business;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.summerland.config.FileStorageProperties;
import com.summerland.entities.House;
import com.summerland.repositories.HouseRepository;

@Service
@Transactional
public class ImplBusinessHouse implements IBusinessHouse{

	@Autowired
	private HouseRepository houseRepository;
	
	//get all the houses
	public  ArrayList<House> getHouses() {
		
		return (ArrayList<House>) houseRepository.findAll();
	}

	@Override
	public void saveHouse(House house) {
	
		Path fileStorageLocation = Paths.get("/Users/admin/git/Summerland_backend/summerland_backend/src/main/resources/images")
                .toAbsolutePath().normalize();
		MultipartFile file=house.getImage();
		if(file != null){
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		Path targetLocation = fileStorageLocation.resolve(fileName);
		house.setPathimage(fileName);
        try {
			Files.copy(file.getInputStream(), targetLocation , StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		houseRepository.save(house);
	}
	
	@Override
	public ArrayList<House> listHousesOfOwner(Long id) {
		
		ArrayList<House> houses = houseRepository.findHouses(id);
		return houses;
	}


}
