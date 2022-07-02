package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.sumAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSumInMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageSumInMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {100, 0, 9, 90, 100, 100, 100, 100, 9, 0, 100, 12};

        long expected = 11;
        long actual = service.maxMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 1, 17, 20, 19, 20, 7, 14, 14, 1};

        long expected = 12;
        long actual = service.minMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAmountMonthLowerAverage() {
        StatsService service = new StatsService();
        long[] sales = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

        long expected = 0;
        long actual = service.amountMonthLowerAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAmountMonthUpperAverage() {
        StatsService service = new StatsService();
        long[] sales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

        long expected = 1;
        long actual = service.amountMonthUpperAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
