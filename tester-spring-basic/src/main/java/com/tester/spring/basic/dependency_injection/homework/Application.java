package com.tester.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {

        DeliveryService deliveryService = new DhlDeliveryService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService);

        shippingCenter.sendPackage("Hill Street 11, New York", 25.0);
    }
}
