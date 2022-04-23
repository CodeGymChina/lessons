package org.codegym.lessons.lesson_20;

import java.io.Serializable;

/**
 * @author JC Liu
 * @date 2022/4/23$
 */
public class Parent implements Serializable {

    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
