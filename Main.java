package com.company;

import com.company.epam.tasks01.Methods;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        int number = 36;
        System.out.println("Последняя цифра квадрата числа " + number + " - "
                + Methods.findLastDigitSquare(36));

        int month = 12;
        int year = 2001;
        System.out.println("Количество дней в " + month + " месяце " + year +
                " года - " + Methods.amountOfDays(month, year));

        double square = 24;
        System.out.println("Площадь квадрата, вписанного в данную окружность, - " + Methods.innerSquareArea(square) +
                ". Площадь вписанного квадрата в " + Methods.differenceOfAreas(square)
                + " раза меньше площади заданного квадрата.");

        int A = 34;
        int B = 45;
        int C = 98;
        int D = 33;
        System.out.println("Среди чисел " + A + ", " + B + ", " + C + ", " + D + " есть хотя бы два четных? " +
                Methods.ifThereAre2Evens(A, B, C, D));

        int number2 = 28;
        System.out.println("Является ли число " + number2 + " совершенным? " + Methods.isPerfect(28));

        int seconds = 263;
        System.out.println("Спустя " + seconds + " секунд прошло " + Methods.hoursMinutesSeconds(seconds)[0] +
                " часов " + Methods.hoursMinutesSeconds(seconds)[1] + " минут " +
                Methods.hoursMinutesSeconds(seconds)[2] + " секунд.");

        double x1 = 5;
        double y1 = 4;
        double x2 = 2;
        double y2 = 10;
        System.out.println("Из точек А(" + x1 + "," + y1 + ") и B(" + x2 + "," + y2 +
                ") ближе к началу координат расположена " + Methods.whichIsCloserTo00(x1, y1, x2, y2));

        double x = 30;
        System.out.println("Значение функции при х=" + x + ": " + Methods.function(x));

        double R = 22;
        System.out.println("Длина окружности круга с радиусом R=" + R + " равна " +
                Methods.circumference(R) + ", площадь равна " + Methods.square(R));

        double a = 3.5;
        double b = 7.2;
        double h = 1.2;
        System.out.println("Значения функции tg(x) на отрезке [" + a + "," + b + "] с шагом " + h + ":");
        for (Map.Entry<Double, Double> functions : Methods.tang(a, b, h).entrySet()) {
            System.out.println(functions.getKey() + " " + functions.getValue());
        }
    }
}
