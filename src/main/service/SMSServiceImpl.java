package main.service;

public class SMSServiceImpl implements MessageService{
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Sms sent to " + rec + " with message: " +msg);
    }
}
