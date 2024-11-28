package com.abhishek.SOLID.OCP.GoodCode;

public class Paypal implements PaymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("Payment done using Paypal:"+amount);
    }
}
