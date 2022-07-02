package com.amo.thread;

public class Test4 {
    public static void main(String[] args) {
        Student student=new Student();

        new Thread(()->{
            student.setThreadLocal("Amo");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(student.getThreadLocal());
        }).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{
            student.setThreadLocal("Amo123");
            System.out.println(student.getThreadLocal());
        }).start();
    }
}
