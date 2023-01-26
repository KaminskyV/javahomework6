package ru.netology;

public class SQRService {
    public int calculate(int x, int y) {
        int count = 0;
        for (int j = x; j <= y; j++) {
            double numSquareRoot = Math.sqrt(j);
            if (numSquareRoot % 1 == 0) {
                count++;
            }
        }
        return count;
    }
}