package com.amo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


public class ModTest {

    public static void main(String[] args) {
        //使用lambda创建
        FutureTask<String> futureTask=new FutureTask<>(() -> "Success");

        //创建线程
        Thread thread=new Thread(futureTask);
        //启动线程
        thread.start();
        //获取线程的返回结果
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

