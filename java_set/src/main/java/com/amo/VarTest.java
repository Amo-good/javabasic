package com.amo;


import java.util.ArrayList;
import java.util.Arrays;

public class VarTest {
    private static final int x=100;
    public static void add(){
        final int a=4;
        System.out.println(a);
    }
    public static void main(String[] args) {
            //Integer 通过new创建
            Integer n1=new Integer(127);
            Integer n2=new Integer(127);
            System.out.println("通过new方式创建值为:"+(n1==n2));
            //直接赋值在-128~127之间
            Integer n3=127;
            Integer n4=127;
            System.out.println("直接赋值在-128到127之间:"+(n3==n4));
            //使用ValueOf与直接赋值的对比(未超出)
            Integer n5=Integer.valueOf(127);
            System.out.println("使用ValueOf与直接赋值的对比"+(n4==n5));
            //超出-128~127的值比较
            Integer n6=128;
            Integer n7=128;
            System.out.println("赋值超出128为:"+(n6==n7));
            //使用ValueOf与直接赋值的对比(超出)
            int n8=Integer.valueOf(128);
            System.out.println("使用ValueOf与直接赋值的对比"+(n8==n7));
            char c[]={'h','e'};


    }
}

