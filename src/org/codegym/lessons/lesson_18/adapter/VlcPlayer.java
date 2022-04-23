package org.codegym.lessons.lesson_18.adapter;

/**
 * @author JC Liu
 * @date 2022/4/16$
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
