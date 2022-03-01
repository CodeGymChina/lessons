package org.codegym.lessons.lesson_04;

/**
 * @author JC Liu
 * @date 2022/2/26$
 */
public class Demo01 {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setHp(100);
        hero.setSpeed(10);
        hero.setAttackPoint(50);
        System.out.println("hp: " + hero.getHp());
    }


}
