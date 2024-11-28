package com.abhishek.SOLID.DIP.GoodCode;

public class SmsService implements NotificationChannel{
    @Override
    public void sendMsg(String msg) {
        System.out.println("Message from SmsService:"+msg);
    }
}
