package org.example.mySpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testspring {
    public static void main(String[] args) {
             //указываес из какого файла будем получать БИН
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("musicalBean3",ClassicalMusic.class);
        classicalMusic.getSong();

            //получаем БИН,Он будет того класса,который указан в файле с описание создаваемого Бина
            //Music music = context.getBean("musicalBean",Music.class);

            //создаем зависимость (передаем БИН)
            //       MusicPlayer musicPlayer = new MusicPlayer(music);
            //      musicPlayer.playMusic();

            //________________________________________________________________________
            //dependence injection
            //В файле аппликатион,мы сделали напрямую зависимость     <constructor-arg ref="musicalBean"/>
            // БИНА music и Бина musicPlayer - т.е.без вышеуказанного кода
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//            //________________________________________________________________________
//            //dependence with setter
//        musicPlayer.playMusic();


        context.close();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
    }
}
