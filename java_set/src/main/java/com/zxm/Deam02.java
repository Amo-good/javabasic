package com.zxm;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Deam02 {
    public static void main(String[] args) {
        HashMap<String,Person> hashMap=new HashMap<>();
        Person p1=new Person("Amo",18);
        Person p2=new Person("AmoGood", 19);
        Person p3=new Person("啊莫", 19);
        hashMap.put("Amo",p1);
        hashMap.put("AmoGood",p2);
        hashMap.put("啊莫",p3);
        System.out.println(hashMap.size());
        System.out.println(hashMap);
        for (String key : hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }

        for (Map.Entry<String,Person> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+"=====>"+entry.getValue());
        }

    }
}
