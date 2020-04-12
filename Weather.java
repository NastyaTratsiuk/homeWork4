package com.itaccademy;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input numbers of days:");
        int days = scan.nextInt();
        int maxRain = 0;
        int sumRainfall = 0;


        for (int i = 0; i < days; i++) {
            System.out.println("Количество осадков на день:");
            int rain = scan.nextInt();
            if (maxRain < rain) {
                maxRain = rain;
            }
            sumRainfall += rain;
        }
        System.out.println("Количество дней:" + days);
        System.out.println("Сумма осадков за этот период:" + sumRainfall);
        System.out.println("Среднее количество осадков за этот период:" + (double) sumRainfall / days);
        System.out.println("Максимальное количество осадков :" + maxRain);

    }

}







