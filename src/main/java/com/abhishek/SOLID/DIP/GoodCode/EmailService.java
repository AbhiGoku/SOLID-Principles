package com.abhishek.SOLID.DIP.GoodCode;

public class EmailService implements NotificationChannel{
    @Override
    public void sendMsg(String msg) {
        System.out.println("Message from EmailService:"+msg);
    }
}
