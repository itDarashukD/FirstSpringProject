package org.example.mySpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Testspring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


//        //получаем БИН,Он будет того класса,который указан в файле с описание создаваемого Бина
//        Music music = context.getBean("rockMusic", Music.class);
//        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
//
//        //создаем зависимость (передаем БИН)
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
//        classicalMusicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

//        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
//
//            classicalMusic1.getSong();

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());

//        Computer computer = context.getBean("computer",Computer.class);
//        System.out.println(computer);
                context.close();

            }
        }
