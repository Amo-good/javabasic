package com.amo.obj;

public class ObjectTest {


    public static void main(String[] args) {

        Son son1=new Son("cola");
        Son son2=new Son("aguo");
        System.out.println("改之前："+son1.name+"  "+son2.name);
        change(son1, son2);
        System.out.println("改之后："+son1.name+" "+son2.name);
    }

    public static void change(Son obj1,Son obj2){
        Son obj3=obj1;
        obj1=obj2;
        obj2=obj3;
        //改变值
        obj1.name="我改变的应该是son2中的名字";
    }
}
class Son {
    String name;

    public Son(String name) {
        this.name = name;
    }
}