package com.summerland.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.summerland.entities.Announcement;

public interface AnnouncementRepository  extends JpaRepository<Announcement, Long>{

}
