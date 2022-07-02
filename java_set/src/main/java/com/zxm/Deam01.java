package com.zxm;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Deam01 {
    public static void main(String[] args) {
        Person p1=new Person("Amo",18);
        Person p2=new Person("AmoGood", 19);
        Person p3=new Person("啊莫", 19);

        HashSet<Person> hashSet=new HashSet<>();
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        //添加重复元素
//        hashSet.add(p3);
        hashSet.add(new Person("啊莫", 19));
        Iterator<Person> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        
        HashSet<String> set=new HashSet<>();
        set.add("Amo");
       set.add(new String("Amo"));
        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
