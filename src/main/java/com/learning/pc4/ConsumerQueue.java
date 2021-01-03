package com.learning.pc4;

import java.util.concurrent.BlockingQueue;

/**
 * @Auther:yinzhen
 * @Date:2021/1/3 21:05
 * @Description:com.learning.pc4
 * @version: 1.0
 */
public class ConsumerQueue implements Runnable {
    private BlockingQueue<Goods> blockingQueue;

    public ConsumerQueue(BlockingQueue<Goods> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                System.out.println("消费者消费的商品是："+blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
