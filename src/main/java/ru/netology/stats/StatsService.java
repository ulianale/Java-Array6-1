package ru.netology.stats;

public class StatsService {
    public long sumAllSales(long[] sales) {     // Сумма всех продаж
        long sum = 0;
        for (long sale : sales) {
            //for (int i = 0; i < sales.length; i++) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSumInMonth(long[] sales) {     // Средняя сумма за месяц
        return (sumAllSales(sales) / 12);
    }

    public int maxMonth(long[] sales) {              // Номер месяца с максимальной продажей
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonth(long[] sales) {      // Номер месяца с минимальной продажей
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int amountMonthLowerAverage(long[] sales) {    // Кол-во месяцев где продажи ниже среднего
        int amount = 0;
        for (long sale : sales) {
            if (sale < (averageSumInMonth(sales))) {
                amount++;
            }
        }
        return amount;

    }

    public int amountMonthUpperAverage(long[] sales) {     // Кол-во месяцев где продажи выше среднего
        int amount = 0;
        for (long sale : sales) {
            if (sale > (averageSumInMonth(sales))) {
                amount++;
            }
        }
        return amount;
    }
}





