package org.codegym.lessons.lesson_16;

/**
 * @desc:
 * @author: zhailihu
 * @date: 09/04/2022 20:11
 */
public class Goods {
    //变量stock代表商品库存
    private volatile Integer stock = 1;

    //执行库存减一操作
    public void decrStock() {
        this.stock = this.stock - 1;
        System.out.println(Thread.currentThread().getName()+"\t剩余库存："+stock);
    }

    public Integer getStock() {
        return this.stock;
    }
}
