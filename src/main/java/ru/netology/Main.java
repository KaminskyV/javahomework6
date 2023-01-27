package ru.netology;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int begin = 10;
        int end = 99;
        int count = service.calculate(begin, end);
        System.out.println(count);
    }
}