package com.learning;

/**
 * @Auther:yinzhen
 * @Date:2021/1/3 12:39
 * @Description:com.learning
 * @version: 1.0
 */
public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"------------"+i);
        }
    }
}
