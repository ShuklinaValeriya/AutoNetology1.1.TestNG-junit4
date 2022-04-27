package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldRemain200of800() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(800);
        int expected = 200;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldRemain400of600() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(600);
        int expected = 400;
        Assert.assertEquals(actual, expected);

    }

}