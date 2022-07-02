package com.amo.obj;

import java.util.concurrent.locks.Lock;

public class FatherAndSon {
    public static void main(String[] args) {
        new So("a");

    }
}

class Father{


    public Father(String name){
        System.out.println("父亲的有参构造"+name);
    };
    public Father(){

        System.out.println("默认继承我的无参构造喔");
    }
}
class So extends Father{

    public So(String name){
//        super(name);
        super("A");
        System.out.println("我是儿子");
    }
}
