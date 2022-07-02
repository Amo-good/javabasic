package com.amo.single;


/**
 * 双重检查锁实现(线程安全)
 */
public class SingleDoubleLock {
    //加上volatile关键字，防止JVM指令重排
    private static volatile SingleDoubleLock uniqueInstance;

    private SingleDoubleLock(){};


    public static SingleDoubleLock getUniqueInstance(){
        if (uniqueInstance==null){
            //改变加锁的位置
            synchronized (SingleDoubleLock.class){
                if (uniqueInstance==null){
                    uniqueInstance=new SingleDoubleLock();
                }
            }
        }
        return uniqueInstance;
    }
}
