package com.zxm;

import java.util.*;

public class Deam03 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        ArrayList<Integer> arrayList1=new ArrayList<>();
        //注意:使用此方法需要目标的arraylist的有值
        arrayList1.add(0);
        arrayList1.add(0);
        arrayList1.add(0);
        arrayList1.add(0);
        arrayList1.add(0);
        arrayList1.add(0);
        Collections.copy(arrayList1,arrayList);
        arrayList1.forEach(System.out::println);
    }
}
