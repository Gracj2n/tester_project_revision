package com.tester.spring.dependency_injection.homework;

public class ShippingCenter {

    private DeliveryService deliveryService;
    private NotificationService notificationService = new NotificationService();

    public ShippingCenter(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight) == true) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
