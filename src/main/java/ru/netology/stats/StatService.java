package ru.netology.stats;

public class StatService {
    public long calculateSum(long[] months) {
        long sum = 0;
        for (long month : months) {
            sum += month;
        }
        return sum;
    }

    public long findMax(long[] sales) {
        long maxSale = sales[0];
        long numberMaxMonth = 0;
        for (int j = 0; j < sales.length; j++) {
            if (maxSale <= sales[j]) {
                maxSale = sales[j];
                numberMaxMonth = j + 1;
            }
        }
        return numberMaxMonth;
    }


    public long findMin(long[] sales) {
        long minSale = sales[0];
        long numberMinMonth = 0;
        for (int j = 0; j < sales.length; j++) {
            if (minSale > sales[j]) {
                minSale = sales[j];
                numberMinMonth = j + 1;
            }
        }
        return numberMinMonth;
    }

    public long calculateBelowMid(long[] months) {
        long numberBelowMid = 0;
        long mid = calculateMid(months);
        for (long month : months) {
            if (mid > month) {
                numberBelowMid++;

            }
        }
        return numberBelowMid;
    }

    public long calculateAboveMid(long[] months) {
        long numberAboveMid = 0;
        long mid = calculateMid(months);
        for (long month : months) {
            if (mid < month) {
                numberAboveMid++;

            }
        }
        return numberAboveMid;
    }

    public long calculateMid(long[] months) {
        long mid = 0;
        if (months.length > 0) {
            long sum = calculateSum(months);
            for (long month : months) {
                mid = sum / months.length;
            }
        }
        return mid;
    }
}



