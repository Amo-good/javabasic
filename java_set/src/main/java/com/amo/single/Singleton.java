package com.amo.single;

/**
 * 懒汉式单例模式(线程不安全)
 * 先不创建实例，当第一次被调用时，再创建实例，所以被称为懒汉式。
 */
public class Singleton {
    //自己创建一个实例，不给其他人创建
    private static Singleton uniqueInstance;

    //私有的构造函数
    private Singleton(){};

    /**
     * 提供获取该单例的方法，只有被需要的时候才创建，在多线程下不安全
     * @return
     */
    public static Singleton getUniqueInstance(){
        if (uniqueInstance==null){
            uniqueInstance=new Singleton();
        }
        return uniqueInstance;
    }

    /**
     * 饿汉式线程安全，加锁
     * @return
     */
//    public static synchronized Singleton getUniqueInstance(){
//        if (uniqueInstance==null){
//            uniqueInstance=new Singleton();
//        }
//        return uniqueInstance;
//    }

}
