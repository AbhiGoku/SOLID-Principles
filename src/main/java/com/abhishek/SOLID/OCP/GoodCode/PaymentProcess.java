package com.abhishek.SOLID.OCP.GoodCode;

public class PaymentProcess {
    public void processPayment(PaymentMethod paymentMethod, int amount){
        paymentMethod.pay(amount);
    }
}
