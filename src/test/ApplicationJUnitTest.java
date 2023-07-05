package test;

import main.consumer.Application;
import main.consumer.Consumer;
import main.injector.MessageServiceInjector;
import main.service.MessageService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ApplicationJUnitTest {
    private MessageServiceInjector injector;
    @Before
    public void setUp(){
        // mock the injector
        injector = new MessageServiceInjector() {
            @Override
            public Consumer getConsumer() {
                //mock the message service
                return new Application(new MessageService() {
                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("mock Message service");
                    }
                });
            }
        };
    }

    @Test
    public void test(){
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hello Test", "test@test.org");
    }
    @After
    public void tear(){
        injector = null;
    }
}
