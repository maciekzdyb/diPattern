package main.injector;

import main.consumer.Application;
import main.consumer.Consumer;
import main.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector{

    @Override
    public Consumer getConsumer() {
        return new Application(new EmailServiceImpl());
    }
}
