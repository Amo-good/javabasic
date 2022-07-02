package com.amo.thread;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 交替输出1A2B.。。。
 */
public class Test3 {
    public static void main(String[] args) {

        Object obj=new Object();
        char num[]="123456".toCharArray();
        char str[]="ABCDEF".toCharArray();
        Thread t1= new Thread(() -> {
            synchronized (obj){
                for (char n:num){
                    System.out.print(n);
                    try {
                        //输出后便等待另一个线程输出
                        obj.notify();
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    obj.notify();
                }
            }
        });
        Thread t2= new Thread(() -> {
            synchronized (obj){
                for (char s:str){
                    System.out.print(s);
                    try {
                        //输出后便等待另一个线程输出
                        obj.notify();
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    obj.notify();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
