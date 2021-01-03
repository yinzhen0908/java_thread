package com.learning;

/**
 * @Auther:yinzhen
 * @Date:2021/1/3 12:40
 * @Description:com.learning
 * @version: 1.0
 */
public class JoinTest {
    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread thread = new Thread(run);
        thread.start();
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"----------"+i);
            if (i==3){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
