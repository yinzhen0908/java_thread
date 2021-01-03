package com.learning.pc;

/**
 * @Auther:yinzhen
 * @Date:2021/1/3 16:27
 * @Description:com.learning.pc
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();

    }
}
