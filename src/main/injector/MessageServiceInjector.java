package main.injector;

import main.consumer.Consumer;

public interface MessageServiceInjector {
    public Consumer getConsumer();

}
