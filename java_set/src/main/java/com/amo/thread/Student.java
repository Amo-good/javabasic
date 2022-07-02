package com.amo.thread;

public class Student {
    private ThreadLocal<String> threadLocal=new ThreadLocal<>();




    public String getThreadLocal() {
        return threadLocal.get();
    }

    public void setThreadLocal(String name) {
        this.threadLocal.set(name);
    }


}
