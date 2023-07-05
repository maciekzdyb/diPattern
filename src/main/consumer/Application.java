package main.consumer;

import main.service.MessageService;

public class Application implements Consumer {

    private MessageService service;

    public Application(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}
