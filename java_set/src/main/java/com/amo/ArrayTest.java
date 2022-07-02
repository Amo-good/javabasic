package com.amo;

import com.amo.single.Singleton;

public class ArrayTest {
    public static void main(String[] args) {
        int f[][]=new int[6][];
        int [][]f1=new int[6][6];
        int []f2[]=new int[6][];
        int f3[][]={{1,2,3},{1,2}};
        Singleton uniqueInstance = Singleton.getUniqueInstance();
        System.out.println(uniqueInstance);
    }
}
