package ru.netology.stats;

public class StatsService {

    // 1.Сумма всех продаж
    public long amountSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    // 2.Средняя сумма продаж в месяц
    public double averageSumSales(long[] sales) {
        double average = 0;
        if (sales.length > 0) {
            double sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            average = sum / sales.length;
        }
        return average;
    }

    // 3.Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // 4.Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // 5.Кол-во месяцев, в которых продажи были ниже среднего
    public int counterMonthSalesMin(long[] sales) {
        double average = averageSumSales(sales);

        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
            counter += 1;
            }
        }
        return counter;
    }


    // 6.Кол-во месяцев, в которых продажи были выше среднего
    public int counterMonthSalesMax(long[] sales) {
        double average = averageSumSales(sales);

        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average){
                counter += 1;
            }
        }
        return counter;
    }
}
