package ru.netology;

public class SQRService {
    public int calculate(int begin, int end) {
        int count = 0;
        for (int j = begin; j <= end; j++) {
            double numSquareRoot = Math.sqrt(j);
            if (numSquareRoot % 1 == 0) {
                count++;
            }
        }
        return count;
    }
}