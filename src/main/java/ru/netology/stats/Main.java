package ru.netology.stats;

public class Main {

    public static void main(String[] args) {

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        service.amountSales(sales);
        service.averageSumSales(sales);
        service.maxSales(sales);
        service.minSales(sales);
        service.counterMonthSalesMin(sales);
        service.counterMonthSalesMax(sales);

        System.out.println(service.amountSales(sales));
        System.out.println(service.averageSumSales(sales));
        System.out.println(service.maxSales(sales));
        System.out.println(service.minSales(sales));
        System.out.println(service.counterMonthSalesMin(sales));
        System.out.println(service.counterMonthSalesMax(sales));
    }
}
