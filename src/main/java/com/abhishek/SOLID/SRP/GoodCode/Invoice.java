package com.abhishek.SOLID.SRP.GoodCode;



public class Invoice {
    private double amount;

    public Invoice(int amount){
        this.amount=amount;
    }

    public void generateInvoice(){
        System.out.println("Generating invoice:"+amount);
    }
}
