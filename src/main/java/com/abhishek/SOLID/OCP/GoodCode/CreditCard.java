package com.abhishek.SOLID.OCP.GoodCode;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("Payment done using credit card:"+amount);
    }
}
