package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainIfAmountLowerBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 805;

        int actual = cashbackHackService.remain(amount);
        int expected = 195;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldRemainIfAmountNearBoundary1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldRemainIfAmountEqualsBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldRemainIfAmountNearBoundary2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldRemainIfAmountUpperBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1499;

        int actual = cashbackHackService.remain(amount);
        int expected = 501;

        assertEquals(actual, expected);

    }
}