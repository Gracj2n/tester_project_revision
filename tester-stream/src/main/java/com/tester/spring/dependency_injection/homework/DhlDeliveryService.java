package com.tester.spring.dependency_injection.homework;

public class DhlDeliveryService implements DeliveryService{
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 50) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering by DHL in progress...");
        return true;
    }
}
