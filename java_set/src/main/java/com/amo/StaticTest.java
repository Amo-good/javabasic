package com.amo;

public class StaticTest {
    static int a=3;
    int b=4;

    public StaticTest(){
        System.out.println("我是构造函数");
    }

    {
        System.out.println("我是普通的代码块");
    }

    static {
        StaticTest s=new StaticTest();
        System.out.println("静态代码块中执行");
    }

    public static void main(String[] args) {
        StaticTest staticTest =new StaticTest();
//        StaticTest staticTest1 =new StaticTest();
//        System.out.println(staticTest.b);
    }

}
