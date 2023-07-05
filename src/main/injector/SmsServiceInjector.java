package main.injector;

import main.consumer.Application;
import main.consumer.Consumer;
import main.service.SMSServiceImpl;

public class SmsServiceInjector implements MessageServiceInjector{
    @Override
    public Consumer getConsumer() {
        return new Application(new SMSServiceImpl());
    }
}
