package com.tester.mockito.notification;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NotificationService {

    private Set<Client> clientsSet = new HashSet<>();

    public void addSubscriber(Client client) {
      this.clientsSet.add(client);
    }

    public void removeSubscriber(Client client) {
        this.clientsSet.remove(client);
    }

    public void sendNotification(Notification notification) {
        this.clientsSet.forEach(client -> client.receive(notification));
    }
}
