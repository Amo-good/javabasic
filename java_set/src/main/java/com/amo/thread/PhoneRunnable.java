package com.amo.thread;

import java.util.concurrent.TimeUnit;

/**
 * 任务类，送出手机给秒杀成功的用户
 */
public class PhoneRunnable implements Runnable {
    //手机数量
    private static int phoneNum=10;
    //参与秒杀活动的客户
    private String name;
    public PhoneRunnable(String name){
        this.name=name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        //睡眠0.2毫秒，模拟真实
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //任务，送手机（保证线程安全）
        synchronized (PhoneRunnable.class){
            if (phoneNum>0){
                //判断手机库存是否还有
                System.out.println("恭喜【"+Thread.currentThread().getName()+"】秒杀成功！！");
                phoneNum--;
            }
        }

    }
}
