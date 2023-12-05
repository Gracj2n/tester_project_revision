package com.tester.mockito.notification;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Not;

public class NotificationServiceTest {

    NotificationService notificationService = new NotificationService();

    //Mocks:
    Notification notification = Mockito.mock(Notification.class);
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);
    Client client4 = Mockito.mock(Client.class);


    @Test
    void notSubscribedClientShouldNotReceiveNotification() {
        notificationService.sendNotification(notification);

        Mockito.verify(client1, Mockito.never()).receive(notification);
    }

    @Test
    void subscribedClientShouldReceiveNotification() {
        notificationService.addSubscriber(client1);
        notificationService.sendNotification(notification);

        Mockito.verify(client1, Mockito.atLeastOnce()).receive(notification);
    }

    @Test
    void notificationShouldBeSentToAllSubscribedClients() {
        notificationService.addSubscriber(client1);
        notificationService.addSubscriber(client2);
        notificationService.addSubscriber(client3);
        notificationService.addSubscriber(client4);
        notificationService.sendNotification(notification);

        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
        Mockito.verify(client4, Mockito.times(1)).receive(notification);
    }

    @Test
    void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        notificationService.addSubscriber(client1);
        notificationService.addSubscriber(client1);
        notificationService.addSubscriber(client1);
        notificationService.sendNotification(notification);

        Mockito.verify(client1, Mockito.times(1)).receive(notification);
    }

    @Test
    void unsubscribedClientShouldNotReceiveNotification() {
        notificationService.addSubscriber(client1);
        notificationService.removeSubscriber(client1);
        notificationService.sendNotification(notification);

        Mockito.verify(client1, Mockito.never()).receive(notification);
    }
}
