package com.amo;

public interface Mytest {

    default void say(){
        System.out.println("我是默认的方法，你可以不需要重写");
    };
    static void run(){
        System.out.println("我是静态的，你可以不需要重写");
    };


}

class InterTest implements Mytest{

    @Override
    public void say() {
        System.out.println("我重写了default方法");
    }

    public static void main(String[] args) {
        InterTest interTest=new InterTest();
        interTest.say();

    }
}
