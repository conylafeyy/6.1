package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public long avgSales(long[] sales) {
        long sumSales = sumSales(sales);
        return sumSales / sales.length;
    }

    public long peakSales(long[] sales) {
        int peakMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[peakMonth]) {
                peakMonth = month;
            }
            month += 1;
        }
        return peakMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public long lowerThanAvg(long[] sales) {
        long avgSales = avgSales(sales);
        long amount = 0;
        for (long sale : sales) {
            if (sale < avgSales) {
                amount += 1;
            }
        }
        return amount;
    }

    public long higherThanAvg(long[] sales) {
        long avgSales = avgSales(sales);
        long amount = 0;
        for (long sale : sales) {
            if (sale > avgSales) {
                amount += 1;
            }
        }
        return amount;
    }
}
