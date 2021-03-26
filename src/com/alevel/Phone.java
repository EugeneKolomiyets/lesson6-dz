package com.alevel;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class Phone {
    private int number,model,weight;
    Phone (int number,int model, int weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
    }
    Phone (int number,int model){
        this.number=number;
        this.model=model;
    }
    Phone(){
    }
    @Override
    public String toString(){
        return "number "+number+" model: "+model+" weight"+weight;
    }
    public void recieveCall(String name){
        System.out.println("Звонит "+name);
    }
    public int getNumber(){
        return number;
    }
}
