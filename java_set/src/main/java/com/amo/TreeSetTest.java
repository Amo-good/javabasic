package com.amo;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<Integer>();
        TreeSet<Integer> subSet=new TreeSet<Integer>();

        for (int i=606;i<613;i++){
            if (i%2==0){
                set.add(i);
            }
        }

        /**
         * subSet方法相当于视图，返回调用者中位于608到611之间的数，true含义是是否包含界限
         * 对视图subSet的修改会影响到原来的set（只能在608-611之间修改，超出则会报异常）
         * set的修改也会影响subSet
         */
        subSet=(TreeSet)set.subSet(608,true, 611,true);
        subSet.add(609);
        System.out.println(set+""+subSet);
    }
}
