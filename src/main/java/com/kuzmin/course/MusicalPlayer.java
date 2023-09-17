package com.kuzmin.course;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MusicalPlayer {
   // private List<Music> musicList=new ArrayList<>(); //
    private Music music;

  /*  private String name;
    private  int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public MusicalPlayer() {
    }*/
    public MusicalPlayer(Music music) {
        this.music = music;
    }
  /*  public void setMusicList (List musicList){
        this.musicList = musicList;//сеттер для проигрывания списка
    }*/

  /* public void setMusic(Music music){
        this.music=music;
    }*/
    public void musicalPlayer(){
        System.out.println("Playing :"+music.getSong());
    }
   /* public void musicalPlayer(){
        for(Music music: musicList){
            System.out.println("Playng: "+music.getSong());
        }
    }*/
}
