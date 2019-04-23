package com.summerland.business;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.summerland.entities.Announcement;
import com.summerland.repositories.AnnouncementRepository;

@Service
@Transactional
public class ImplBusinessAnnouncement implements IBusinessAnnouncement{

	@Autowired
	private AnnouncementRepository announcementRepository;
	
	public ArrayList<Announcement> getAnnouncement()
	{
		return (ArrayList<Announcement>) announcementRepository.findAll();
	}
}
