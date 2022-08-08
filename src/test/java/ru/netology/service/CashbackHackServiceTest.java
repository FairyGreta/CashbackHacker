package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBuy300() {
        int amount = 5700;
        int expected = 300;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldBuy100() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldBuy10() {
        int amount = 990;
        int expected = 10;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfNoAmount() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    // тест падает, так как предлагает докупить еще на 1000
    @Test
    public void shouldBuy0() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

}