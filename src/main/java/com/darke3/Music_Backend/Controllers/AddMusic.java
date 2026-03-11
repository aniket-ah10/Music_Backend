package com.darke3.Music_Backend.Controllers;

import com.darke3.Music_Backend.Model.MusicCard;
import com.darke3.Music_Backend.Repo.MusicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/MusicCard")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://aniketsmusic.netlify.app"})
public class AddMusic {
    @Autowired
    private MusicRepo musicRepo;
    @PostMapping
    public void saveMusic(@RequestBody MusicCard musicCard) {
        musicRepo.save(musicCard);
    }
    @GetMapping
    public List<MusicCard> getMusicList() {
        return musicRepo.findAll();
    }
}
