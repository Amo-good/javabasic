package com.amo.thread;

public class ObjTest {
    public static void main(String[] args) {
        Num num=new Num();
        Thread t1=new T1(num);
        Thread t2=new T2(num);
        t1.start();
        t2.start();
    }

}


class Num{
    Integer i=1;
}

class T1 extends Thread{
    private Num num;
    public T1(Num num){
        this.num=num;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("t1");
        while (num.i<100){
            synchronized (num){
                if (num.i%2==0){
                    try {
                        //t1负责输出奇数
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"=>"+num.i++);
                //唤醒另一个线程
                num.notify();
            }
        }
    }
}
class T2 extends Thread{
    private Num num;
    public T2(Num num){
        this.num=num;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("t2");
        while (num.i<100){
            synchronized (num){
                if (num.i%2==1){
                    try {
                        //t1负责输出奇数
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"=>"+num.i++);
                //唤醒另一个线程
                num.notify();
            }
        }
    }
}