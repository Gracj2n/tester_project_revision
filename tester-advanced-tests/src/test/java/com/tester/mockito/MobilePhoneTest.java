package com.tester.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneTest {

    MobilePhone myPhone = Mockito.mock(MobilePhone.class);

    @Test
    void testDefaulyBehaviourOfTestDouble() {
        assertFalse(myPhone.needsCharging());
        Mockito.when(myPhone.needsCharging()).thenReturn(true);
        assertTrue(myPhone.needsCharging());
    }

    @Test
    public void shouldCallLaunchApplication() {
        myPhone.launchApplication("Tetris4D");
        Mockito.verify(myPhone).launchApplication("Tetris4D");
    }
}