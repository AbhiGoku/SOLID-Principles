package com.abhishek.SOLID.DIP.GoodCode;



public class Main {
    public static void main(String[] args) {
        NotificationService emailNotification=new NotificationService(new EmailService());
        emailNotification.notify("Email Service");
        NotificationService smsNotification =new NotificationService(new SmsService());
        smsNotification.notify("Sms");
    }
}
