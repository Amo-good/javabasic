package com.zxm;

public class OuterClass {
    private int a;
    static int b;
   static class InnerClass{
       static int i=1;
       public void show(){
           System.out.println("我只能调用外部类的静态成员或方法"+b);
       }
   }

    public static void main(String[] args) {
        //静态内部类的创建不需要依赖外部类
        InnerClass innerClass=new InnerClass();
        innerClass.show();
    }
}
