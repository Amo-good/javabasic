package com.amo.thread;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) {
       ThreadPoolExecutor executor=new ThreadPoolExecutor(
               5,10,60,TimeUnit.SECONDS,
               new LinkedBlockingDeque<>(10)
       );
       //模拟20个顾客参与活动
        for (int i = 0; i <20 ; i++) {
            PhoneRunnable phoneRunnable=new PhoneRunnable("客户"+i);
            executor.execute(phoneRunnable);
        }
        //执行完关闭
        executor.shutdown();
    }
}
