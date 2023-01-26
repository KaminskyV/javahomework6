package ru.netology;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int x = 10;
        int y = 99;
        int count = service.calculate(x, y);
        System.out.println(count);
    }
}