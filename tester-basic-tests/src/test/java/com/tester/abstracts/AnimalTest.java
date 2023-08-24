package com.tester.abstracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void launch() {
        Dog dog = new Dog();
        Duck duck = new Duck();

        dog.giveVoice();
        duck.giveVoice();

        Animal dog2 = new Dog();
        System.out.println("Dog has: " + dog2.getNumberOfLegs() + " legs.");

        AnimalProcessor animalProcessor = new AnimalProcessor();

        animalProcessor.process(dog);
        animalProcessor.process(duck);
    }
}