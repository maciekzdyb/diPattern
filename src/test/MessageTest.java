package test;

import main.consumer.Consumer;
import main.injector.EmailServiceInjector;
import main.injector.MessageServiceInjector;
import main.injector.SmsServiceInjector;

public class MessageTest {
    public static void main(String[] args){
        String msg = "Hello msg";
        String email = "msg@gmail.com";
        String phone = "666666666";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg,email);

        //send sms
        injector = new SmsServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
