package com.tester.spring.dependency_injection;

public class SimpleApplicationRunner {

    public static void main(String[] args) {

        MessageService facebookMessageService = new FacebookMessageService();
        MessageService textMessageService = new TextMessageService();
        MessageService emailMessageService = new EmailMessageService();

        SimpleApplication simpleApplicationV1 = new SimpleApplication(facebookMessageService);
        SimpleApplication simpleApplicationV2 = new SimpleApplication(textMessageService);
        SimpleApplication simpleApplicationV3 = new SimpleApplication(emailMessageService);

        simpleApplicationV1.processMessage("Test Message 1", "John Test");
        simpleApplicationV2.processMessage("Test Message 2", "123 123 123");
        simpleApplicationV3.processMessage("Test Message 3", "TestReceiver@mail.com");
    }
}
