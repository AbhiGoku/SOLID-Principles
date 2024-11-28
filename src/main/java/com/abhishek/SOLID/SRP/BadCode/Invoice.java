package com.abhishek.SOLID.SRP.BadCode;

public class Invoice {
    private double amount;

    public Invoice(int amount){
        this.amount=amount;
    }

    public void generateInvoice(){
        System.out.println("Generating invoice:"+amount);
    }

    //additional functionalities, which doesn't obey the Single responsibility rule.
    public void sendEmailofInvoice(){
        System.out.println("Sending invoice");
    }

    public void saveInvoiceToDB(){
        System.out.println("saving to Database");
    }
}
