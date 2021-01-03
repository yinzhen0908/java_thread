package com.learning.pc2;

/**
 * @Auther:yinzhen
 * @Date:2021/1/3 16:19
 * @Description:com.learning.pc
 * @version: 1.0
 */
public class Consumer implements Runnable {
    private Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {

        for (int i=0;i<10;i++){
            goods.get();
        }
    }
}
