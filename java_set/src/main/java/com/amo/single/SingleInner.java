package com.amo.single;

/**
 * 静态内部类实现（线程安全）
 */
public class SingleInner {



    private SingleInner(){};


    private static class SingletonHolder {
        private static final SingleInner uniqueInstance=new SingleInner();
    }

    public static SingleInner getUniqueInstance() {
        return SingletonHolder.uniqueInstance;
    }
}
