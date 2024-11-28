package com.abhishek.SOLID.OCP.GoodCode;

public class DebitCard implements PaymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("Payment done using debit card:"+amount);
    }
}