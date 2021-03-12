package com.joshua;

public class Back {
    String id;
    int consumption;
    int discount;
    int price;
    public Back(String id, int consumption, int discount, int price){
        this.id = id;
        this.consumption = consumption;
        this.discount = discount;
        this.price = price;
    }
    public void print(){
        System.out.println(id+"\t"+consumption+"\t"+discount+"\t"+price);
    }
}
