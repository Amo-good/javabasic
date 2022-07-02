package com.amo.thread;

public class Shop {
    private  Integer trick;

    public Shop(){
        this.trick=100;
    }

    public void setTrick(Integer trick){
        this.trick=trick;
    }
    public void buy(Integer i){
        Object obj=new Object();
        synchronized(obj){
            Integer before =this.trick;
            Integer after=before-i;
            //更新车票
            setTrick(after);
            System.out.println("车票剩下:"+this.trick);
        }

    }

}
