package org.codegym.lessons.lesson_04;

/**
 * @author JC Liu
 * @date 2022/2/26$
 */
public class MemberAndLocal {

    public static void main(String[] args) {
//        Hero hero = new Hero();
//        hero.setSpeed(10);
//        hero.setAttackPoint(200);
//        hero.setHp(50);
//
//        Hero hero1 = new Hero(15555, 200, 300);
//        System.out.println("hp: "+hero1.getHp());

//        Hero hero2 = new Hero(123, 200);
//        System.out.println("hp: " + hero2.getHp());
//        System.out.println("speed: " + hero2.getSpeed());

//        Hero hero = new Hero();
        Hero.showSth();
    }

    public void method() {
        Hero hero = new Hero();
        int hp = hero.getHp();
        System.out.println(hp);
    }


    // 形参 形式上的参数
    // 实参 实际的参数
}
