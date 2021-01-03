package com.learning.pc3;

/**
 * @Auther:yinzhen
 * @Date:2021/1/3 16:21
 * @Description:com.learning.pc
 * @version: 1.0
 */
public class Goods {
    private String brand;
    private String name;
    private boolean flag = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public synchronized void set(String brand,String name){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        this.setName(name);
        try {
            Thread.sleep(200);//模拟生产耗时时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("生产者生产了"+this.getBrand()+"-----"+this.getName());
        flag = true;
        notify();
    }

    public synchronized void get(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者取走了"+this.getBrand()+"-------"+this.getName());
        flag = false;
        notify();
    }
}
