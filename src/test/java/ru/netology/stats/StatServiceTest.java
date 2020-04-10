package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSum() {
        StatService service = new StatService();

        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(months);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void calculateMid() {
        StatService service = new StatService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateMid(months);

        assertEquals(expected,actual);

    }
    @org.junit.jupiter.api.Test
    void findMax() {
        StatService service = new StatService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.findMax(months);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findMin () {
        StatService service = new StatService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.findMin(months);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void calculateBelowMid () {
        StatService service = new StatService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calculateBelowMid(months);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void calculateAboveMid () {
        StatService service = new StatService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calculateAboveMid(months);

        assertEquals(expected, actual);
    }
}