package com.learning.pc4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Auther:yinzhen
 * @Date:2021/1/3 21:07
 * @Description:com.learning.pc4
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        BlockingQueue<Goods> blockingQueue = new ArrayBlockingQueue<Goods>(5);
        ProducerQueue producerQueue = new ProducerQueue(blockingQueue);
        ConsumerQueue consumerQueue = new ConsumerQueue(blockingQueue);
        new Thread(producerQueue).start();
        new Thread(consumerQueue).start();
    }
}
