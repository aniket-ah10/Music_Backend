package com.darke3.Music_Backend.Model;

import jakarta.persistence.*;

@Entity
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

    public MusicCard(){

    }

    public MusicCard(String title, String imgSrc, String imgAlt ,String songLink, String artist,boolean isFav) {
        this.title = title;
        this.imgSrc = imgSrc;
        this.imgAlt = imgAlt;
        this.songLink = songLink;
        this.artist = artist;
        this.isFav = isFav;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getImgAlt() {
        return imgAlt;
    }

    public void setImgAlt(String imgAlt) {
        this.imgAlt = imgAlt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSongLink() {
        return songLink;
    }

    public void setSongLink(String songLink) {
        this.songLink = songLink;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setFav(boolean fav) {
        isFav = fav;
    }
}

