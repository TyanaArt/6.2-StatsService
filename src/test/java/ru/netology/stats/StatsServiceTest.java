package ru.netology.stats;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void Test1(){
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.amountSales(sales);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test2(){
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = service.averageSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Test3(){
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test4(){
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test5(){
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.counterMonthSalesMin(sales);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test6(){
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.counterMonthSalesMax(sales);
        Assert.assertEquals(expected, actual);
    }
}
