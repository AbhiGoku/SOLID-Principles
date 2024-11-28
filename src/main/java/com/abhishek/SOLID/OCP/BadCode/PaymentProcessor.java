package com.abhishek.SOLID.OCP.BadCode;

public class PaymentProcessor {

    public void processPayment(String paymentMethod,int amount) throws Exception {

        if(paymentMethod.equals("Credit Card")){
            System.out.println("Payment via Credit Card:"+amount);
        }else if(paymentMethod.equals("Debit Card")){
            System.out.println("Payment via Debit Card:"+amount);
        }else if(paymentMethod.equals("Paypal")){
            System.out.println("Payment via Paypal:"+amount);
        }else{
            throw new Exception("Wrong payment method");
        }
    }
}
