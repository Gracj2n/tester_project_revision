package com.tester.spring.basic.spring_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextMessageService implements MessageService{
    @Override
    public String send(String message, String receiver) {
        return "Sending [" +message+ "] to:" + receiver + ".";
    }

    @Component
    public static class SimpleApplication {

        private SkypeMessageService messageService;

        @Autowired
        public void setSkypeMessageService(SkypeMessageService messageService) {
            this.messageService = messageService;
        }

        public String processMessage(String message, String receiver) {
            if (checkReceiver(receiver)) {
                return this.messageService.send(message, receiver);
            }
            return null;
        }

        public boolean checkReceiver(String receiver) {
            return receiver != null && !receiver.isEmpty();
        }
    }

    @Component
    public static class SkypeMessageService {

        public String send(String message, String receiver) {
            return "Sending [" + message + "] to: " + receiver + " using Skype";
        }
    }
}
