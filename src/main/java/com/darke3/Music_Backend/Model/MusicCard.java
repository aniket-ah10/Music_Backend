package com.darke3.Music_Backend.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MusicCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String imgSrc;
    private String imgAlt;
    private String songLink;
    private String title;
    private String artist;
    private boolean isFav=false;
}

