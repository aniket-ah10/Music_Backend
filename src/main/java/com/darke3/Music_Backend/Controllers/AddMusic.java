package com.darke3.Music_Backend.Controllers;

import com.darke3.Music_Backend.Model.MusicCard;
import com.darke3.Music_Backend.Service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/MusicCard")
@CrossOrigin(origins = {"http://localhost:5173", "https://aniketsmusic.netlify.app"})
public class AddMusic {
    @Autowired
    private MusicService musicService;

    @PostMapping
    public void saveMusic(@RequestBody MusicCard musicCard) {
        musicService.addMusic(musicCard);
    }

    @GetMapping
    public List<MusicCard> getMusicList() {
        return musicService.findAllMusic();
    }

    @PutMapping("/{id})")
    public void updateMusic(@PathVariable int id) {
        System.out.print(id);
        musicService.updateFav(id);
    }
    @GetMapping("/search/{name}")
    public List<MusicCard> getMusicByName(@PathVariable String name) {
        return musicService.getMusicByName(name);
    }
}
