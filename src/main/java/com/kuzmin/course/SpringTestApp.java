package com.kuzmin.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic=context.getBean("classicalMusic",ClassicalMusic.class);
        MusicalPlayer player=new MusicalPlayer(classicalMusic);
        player.musicalPlayer();//3 строки для вызова проигрывания классической музыки с использование аннотаций

        RockMusic rockMusic=context.getBean("rockMusic", RockMusic.class);
        MusicalPlayer player1=new MusicalPlayer(rockMusic);
        player1.musicalPlayer();//3 строки для вызова проигрывания рок музыки с использованием аннотаций
        // Music music= context.getBean("musicBeans", Music.class);//Получаем в переменную созданный объект
        //Выведем значение переменной name из этого объекта
        //MusicalPlayer musicalPlayer=new MusicalPlayer(music);
     /*   MusicalPlayer firstMusicalPlayer=context.getBean("musicPlayer", MusicalPlayer.class);
        MusicalPlayer seconMusicalPlayer=context.getBean("musicPlayer", MusicalPlayer.class);
        boolean comparison=firstMusicalPlayer==seconMusicalPlayer;
        System.out.println(comparison);
        System.out.println(firstMusicalPlayer);
        System.out.println(seconMusicalPlayer);
        firstMusicalPlayer.setVolume(10);
        System.out.println(firstMusicalPlayer.getVolume());
        System.out.println(seconMusicalPlayer.getVolume());*/
        //musicalPlayer.musicalPlayer();
        //System.out.println(musicalPlayer.getName());
        //System.out.println(musicalPlayer.getVolume());
        context.close(); //Обязательно надо закрывать applicationContext

    }
}
