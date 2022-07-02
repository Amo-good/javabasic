package com.zxm;

import java.util.LinkedList;
import java.util.ListIterator;

public class Deam04 {
    public static void main(String[] args) {
        LinkedList<Person> linkedList=new LinkedList<>();
        Person p1=new Person("Amo",18);
        Person p2=new Person("AmoGood", 19);
        Person p3=new Person("啊莫", 19);
        linkedList.add(p1);
        linkedList.add(p2);
        linkedList.add(p3);
        ListIterator<Person> iterator = linkedList.listIterator();
        while (iterator.hasPrevious()){

            System.out.println(iterator.previous());
        }
    }
}
