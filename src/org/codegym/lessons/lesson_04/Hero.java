package org.codegym.lessons.lesson_04;

/**
 * @author JC Liu
 * @date 2022/2/26$
 */
// public 公共的
public class Hero {

    private int hp; //double

    private int attackPoint;

    private int speed;

    //get set
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void attack() {
        System.out.println("攻击");
    }

    public Hero() {

    }

    public Hero(int hp, int attackPoint) {
        this.hp = hp;
        this.attackPoint = attackPoint;
    }


    public Hero(int hp, int attackPoint, int speed) {
        this.hp = hp;
        this.attackPoint = attackPoint;
        this.speed = speed; //this 指向当前对象
    }

    public static void showSth() {
        System.out.println("hello world");
    }
}
