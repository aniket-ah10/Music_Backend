package com.darke3.Music_Backend.Repo;

import com.darke3.Music_Backend.Model.MusicCard;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepo extends JpaRepository<MusicCard, Integer> {

}
