package org.example.mySpring;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

 Music music;
private List<Music> musicList =new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    private String name;
    private int volume;

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





    //для внедрения зависимостей с помощью конструктора
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }




             //для внедрения зависимостей с помощью сеттера
    public void setMusic(Music music) {
        this.music = music;
    }
 //             для внедрения зависимостей с помощью сеттера
    public MusicPlayer() {
    }






    public void  playMusic(){
        for (Music var:musicList
             ) {
            System.out.println("now playing is :"+var.getSong());

        }
       System.out.println( "now playing is :"+ music.getSong());
    }















}
//    Music music;
//
//    //здесь происходит IoC-инвершен оф контролл,-внедрение контроля.Полиморфизм
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//public void playMusic(){
//    System.out.println("playing :"+music.getSong());
//}
//}
