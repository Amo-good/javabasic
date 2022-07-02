package com.amo.thread;

/**
 * 模拟一下死锁
 */
public class Test1 {

    public static void main(String[] args) {
        Object obj1=new Object();
        Object obj2=new Object();
        Thread thread1=new MyThread1(obj1, obj2);
        Thread thread2=new MyThread2(obj1,obj2);
        thread1.start();
        thread2.start();
    }

}


class MyThread1 extends  Thread{
    private Object obj1;
    private Object obj2;
    public MyThread1(Object obj1,Object obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
    @Override
    public void run() {
        synchronized (obj1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        synchronized (obj2){
            System.out.println("死锁模拟");
        }
        }
    }
}
class MyThread2 extends  Thread{
    private Object obj1;
    private Object obj2;
    public MyThread2(Object obj1,Object obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
    @Override
    public void run() {
        synchronized (obj2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (obj1){
                System.out.println("死锁模拟");
            }
        }
    }
}