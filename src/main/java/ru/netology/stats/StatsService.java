package ru.netology.stats;

public class StatsService {

    public int calculateAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAvgSales(int[] sales) {
        return calculateAllSales(sales) / sales.length;
    }

    public int calculateMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateLessThanAvgSales(int[] sales) {
        int avgSale = calculateAllSales(sales) / sales.length;
        int lessMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale < avgSale) {
                lessMonth++;
            }
            month = month + 1;
        }
        return lessMonth;
    }

    public int calculateMoreThanAvgSales(int[] sales) {
        int avgSale = calculateAllSales(sales) / sales.length;
        int moreMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale > avgSale) {
                moreMonth++;
            }
            month = month + 1;
        }
        return moreMonth;
    }

}