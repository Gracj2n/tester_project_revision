package com.tester.mockito.homework;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherService {

    private Map<User, Set<Alert>> userAlertMap = new HashMap<>();

    public void acceptAlertSubscription(Alert alert, User user) {
        Set<Alert> acceptSubscription = this.userAlertMap.getOrDefault(user, new HashSet<>());

        acceptSubscription.add(alert);

        userAlertMap.put(user, acceptSubscription);
    }

    public void removeAlertSubscription(Alert alert, User user) {
        Set<Alert> removeSubscription = this.userAlertMap.getOrDefault(user, new HashSet<>());

        removeSubscription.remove(alert);

        userAlertMap.put(user, removeSubscription);
    }

    public void removeAllAlerts(User user) {
        userAlertMap.remove(user);
    }

    public void sendAlertToSubscribedUsers(Alert alert) {
        userAlertMap.entrySet()
                .stream()
                .filter(n -> n.getValue().contains(alert))
                .forEach(n -> n.getKey().receive(alert));
    }

    public void sendAlertToAllUsers(Alert alert) {
        userAlertMap.entrySet()
                .stream()
                .forEach(n -> n.getKey().receive(alert));
    }

    public void removeAlertFromAll(Alert alert) {
        userAlertMap.entrySet()
                .stream()
                .forEach(n -> removeAlertSubscription(alert, n.getKey()));
    }



}
