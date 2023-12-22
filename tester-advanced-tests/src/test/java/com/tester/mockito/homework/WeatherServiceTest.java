package com.tester.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTest {

    WeatherService weatherService = new WeatherService();
    User user1 = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    User user3 = Mockito.mock(User.class);
    Alert alert1 = Mockito.mock(Alert.class);
    Alert alert2 = Mockito.mock(Alert.class);
    Alert alert3 = Mockito.mock(Alert.class);
    Alert alertForAll = Mockito.mock(Alert.class);

    @Test
    void shouldSendAlertToSubscribedUsers() {
        weatherService.acceptAlertSubscription(alert1, user1);
        weatherService.acceptAlertSubscription(alert2, user2);
        weatherService.sendAlertToSubscribedUsers(alert1);
        weatherService.sendAlertToSubscribedUsers(alert2);
        Mockito.verify(user1, Mockito.atMostOnce()).receive(alert1);
        Mockito.verify(user1, Mockito.atMostOnce()).receive(alert2);
    }

    @Test
    void shouldRemoveAlertFromUser() {
        weatherService.acceptAlertSubscription(alert1, user1);
        weatherService.removeAlertSubscription(alert1, user1);
        weatherService.sendAlertToSubscribedUsers(alert1);
        Mockito.verify(user1, Mockito.never()).receive(alert1);
    }

    @Test
    void shouldSendAlertToAllUsers() {
        weatherService.sendAlertToAllUsers(alertForAll);
        Mockito.verify(user1, Mockito.atMostOnce()).receive(alertForAll);
        Mockito.verify(user2, Mockito.atMostOnce()).receive(alertForAll);
        Mockito.verify(user3, Mockito.atMostOnce()).receive(alertForAll);
    }

    @Test
    void removeAllAlertsFromUser() {
        weatherService.acceptAlertSubscription(alert1, user1);
        weatherService.acceptAlertSubscription(alert2, user1);
        weatherService.acceptAlertSubscription(alert3, user1);
        weatherService.removeAllAlerts(user1);
        weatherService.sendAlertToSubscribedUsers(alert1);
        weatherService.sendAlertToSubscribedUsers(alert2);
        weatherService.sendAlertToSubscribedUsers(alert3);
        Mockito.verify(user1, Mockito.never()).receive(alert1);
        Mockito.verify(user1, Mockito.never()).receive(alert2);
        Mockito.verify(user1, Mockito.never()).receive(alert3);
    }

    @Test
    void removeAllAlertsFromAllUsers() {
        weatherService.acceptAlertSubscription(alert1, user1);
        weatherService.acceptAlertSubscription(alert1, user2);
        weatherService.acceptAlertSubscription(alert1, user3);
        weatherService.removeAlertFromAll(alert1);
        weatherService.removeAlertFromAll(alert1);
        weatherService.removeAlertFromAll(alert1);
        weatherService.sendAlertToSubscribedUsers(alert1);
        Mockito.verify(user1, Mockito.never()).receive(alert1);
        Mockito.verify(user2, Mockito.never()).receive(alert1);
        Mockito.verify(user3, Mockito.never()).receive(alert1);
    }
}
