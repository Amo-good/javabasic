package com.amo.thread;

public class Test2 {
    public static void main(String[] args) {
        //100张票
        Shop shop=new Shop();
        for (int i = 0; i <100 ; i++) {
            Thread thread=new MyShow(shop);
            thread.start();
        }
    }


}

class MyShow extends Thread{
    private Shop shop;
    public MyShow(Shop shop){
        this.shop=shop;
    }
    @Override
    public void run() {
        shop.buy(1);
    }
}

