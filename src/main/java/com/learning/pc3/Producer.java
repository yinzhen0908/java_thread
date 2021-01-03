package com.learning.pc3;

/**
 * @Auther:yinzhen
 * @Date:2021/1/3 16:19
 * @Description:com.learning.pc
 * @version: 1.0
 */
public class Producer implements Runnable{
    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            if(i%2==0){
                goods.set("哇哈哈", "矿泉水");
            }else{
                goods.set("旺仔", "小馒头");
            }
        }
    }
}
