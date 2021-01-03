package com.learning.pc4;

import java.util.concurrent.BlockingQueue;

/**
 * @Auther:yinzhen
 * @Date:2021/1/3 21:03
 * @Description:com.learning.pc4
 * @version: 1.0
 */
public class ProducerQueue implements Runnable{
    private BlockingQueue<Goods> blockingQueue;

    public ProducerQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            Goods goods = null;
            if(i%2==0){
                goods = new Goods("哇哈哈", "矿泉水");
            }else{
                goods = new Goods("旺仔", "小馒头");
            }
            System.out.println("生产者开始生产商品："+goods);
            blockingQueue.add(goods);
        }
    }
}
