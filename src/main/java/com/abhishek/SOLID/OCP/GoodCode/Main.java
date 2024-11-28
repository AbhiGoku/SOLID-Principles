package com.abhishek.SOLID.OCP.GoodCode;

public class Main {
    public static void main(String[] args){
        PaymentProcess paymentProcess=new PaymentProcess();
        PaymentMethod paymentMethod=new CreditCard();
        paymentProcess.processPayment(paymentMethod,100);

        PaymentProcess paymentMethod1=new PaymentProcess();
        PaymentMethod paymentMethod2=new Paypal();

        paymentProcess.processPayment(paymentMethod2,200);
    }
}
