package org.example.mySpring;

import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:MusicPlayer.properties")
@ComponentScan("org.example.mySpring")
public class SpringConfig {

//    @Bean
//    @Scope("prototype")
//    ClassicalMusic classicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    @Bean
//    RockMusic rockMusic() {
//        return new RockMusic();
//    }
//
//    @Bean
//    MusicPlayer musicPlayer() {
//        return new MusicPlayer(musicList());
//
//    }
//
//    @Bean
//    Computer computer() {
//        return new Computer(musicPlayer());
//    }
//        @Bean
//    RapMusic rapMusic(){
//        return new RapMusic();
//        }
//        @Bean
//    List<Music> musicList(){
//        return Arrays.asList(rapMusic(),rockMusic(),classicalMusic());
//        }

}
