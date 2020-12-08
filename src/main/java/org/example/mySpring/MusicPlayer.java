package org.example.mySpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
//
//    @Value("${musicPlayer.name}") //присваиваем значения переменным из .проперти
//    private String name;
//
//    @Value("${musicPlayer.volume}")
//    private int volume;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }

    private List<Music> musicList ;
@Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    //private ClassicalMusic classicalMusic;
//private RockMusic rockMusic;
//
//@Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    public String playMusic() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        return "now playing is :" +musicList.get(randomNumber).getSong();


    }

}