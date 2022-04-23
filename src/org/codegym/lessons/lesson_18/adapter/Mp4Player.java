package org.codegym.lessons.lesson_18.adapter;

/**
 * @author JC Liu
 * @date 2022/4/16$
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
