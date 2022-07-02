package com.amo.single;

/**
 *  饿汉式单例模式（线程安全）
 *  先不管需不需要使用这个实例，直接先实例化好实例 (饿死鬼一样，所以称为饿汉式)
 */
public class SingleHungry {

    private static SingleHungry uniqueInstance=new SingleHungry();

    private SingleHungry(){};

    public static SingleHungry getUniqueInstance(){
        return uniqueInstance;
    }
}
