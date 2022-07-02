package com.amo.single;

/**
 * 枚举类只有一个值，则可以当作单例设计模式使用
 * 私有构造器
 * private static 成员对象
 * public static 获得成员对象方法
 */
public enum SingleEnum {
    SINGLE_ENUM;
    //相当于 private final static SingleEnum
    public static void doSomeThing(){
        System.out.println("用枚举实现单例模式");
    }
}
