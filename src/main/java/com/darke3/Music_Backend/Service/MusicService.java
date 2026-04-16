package com.darke3.Music_Backend.Service;

import com.darke3.Music_Backend.Model.MusicCard;
import com.darke3.Music_Backend.Repo.MusicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {
    @Autowired
    private MusicRepo musicRepo;
    public void addMusic(MusicCard musicCard){
        musicRepo.save(musicCard);
    }
    public List<MusicCard> findAllMusic(){
        return musicRepo.findAll();
    }

    public void updateFav(int id) {
         MusicCard music=musicRepo.findById(id).orElseThrow();
         music.setFav(!music.isFav());
         musicRepo.save(music);
    }

    public List<MusicCard> getMusicByName(String name) {
        return musicRepo.findByTitleContainingIgnoreCase(name);
    }
}
