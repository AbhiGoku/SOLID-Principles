package com.abhishek.SOLID.DIP.BadCode;

public class Notification {
    EmailService emailService;
    SmsService smsService;

    public void notification(){
        this.emailService=new EmailService();
        this.smsService=new SmsService();
    }

    public void SendMsgByEmail(String msg){
        emailService.sendSMS(msg);
    }
    public void SendMsgByMsg(String msg){
        smsService.sendSMS(msg);
    }
}
