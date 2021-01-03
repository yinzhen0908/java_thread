package com.learning.exercise;

/**
 * @Auther:yinzhen
 * @Date:2021/1/3 14:55
 * @Description:com.learning.exercise
 * @version: 1.0
 * 定义一个线程A，输出1~10之间的整数，定义一个线程B，逆序输出1~10之间的整数，要求线程A和线程B交替输出
 * 分析：使用sleep方法阻塞当前线程，利用睡眠时间差实现
 */
public class Test1 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"=========="+i);
            try {
                Thread.sleep(1001);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Thread thread = new Thread(test1);
        thread.start();
        for (int i=10;i>0;i--){
            System.out.println(Thread.currentThread().getName()+"=========="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
