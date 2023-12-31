package com.tester.spring.basic.dependency_injection;

public class SimpleApplication {

    private final MessageService messageService;

    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(message, receiver);
        }
    }

    public boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}
