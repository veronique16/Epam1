package com.company.epam.tasks01;

import java.util.HashMap;
import java.util.Map;

public class Methods {

    public static int findLastDigitSquare(int number) {                                   //1
        String numberAsString = "" + number;
        String lastDigit = numberAsString.substring(numberAsString.length() - 1);
        int lastDigitInt = Integer.parseInt(lastDigit);
        int squareOfLastDigit = lastDigitInt * lastDigitInt;
        String newNumberAsString = "" + squareOfLastDigit;
        String finalLastDigit = newNumberAsString.substring(newNumberAsString.length() - 1);
        return Integer.parseInt(finalLastDigit);
    }

    public static int amountOfDays(int month, int year) throws Exception {                 //2
        if (month > 12 || month < 1 || year < 0) {
            throw new Exception("Введены неверные данные.");
        } else if (isLeap(year) && month == 2) {
            return 29;
        } else if (!(isLeap(year)) && month == 2) {
            return 28;
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else {
            return 30;
        }
    }

    private static boolean isLeap(int year) {
        if (year % 4 == 0)
            return true;
        else {
            return false;
        }
    }

    public static double innerSquareArea(double outerSquareArea) throws Exception {         //3
        if (outerSquareArea <= 0) {
            throw new Exception("Площадь не может быть отрицательной или равной 0");
        }
        double radius = Math.sqrt(outerSquareArea) / 2;
        //return 2 * radius / Math.sqrt(2);
        return 2 * Math.pow(radius, 2);
    }

    public static double differenceOfAreas(double outerSquareArea) throws Exception {
        if (outerSquareArea <= 0) {
            throw new Exception("Площадь не может быть отрицательной или равной 0");
        }
        double innerSquareArea = innerSquareArea(outerSquareArea);
        return outerSquareArea / innerSquareArea;
    }

    public static boolean ifThereAre2Evens(int A, int B, int C, int D) {                    //4
        int[] numbers = new int[]{A, B, C, D};
        int countOfEvens = 0;
        for (int i = 0; i < 4; i++) {
            if (numbers[i] % 2 == 0) {
                countOfEvens++;
            }
        }
        if (countOfEvens >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPerfect(int number) {                                           //5
        int sumOfDividers = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDividers += i;
            }
        }
        if (number == sumOfDividers) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] hoursMinutesSeconds(int second) throws Exception {                 //6
        if (second < 0) {
            throw new Exception("Количество секунд не может быть отрицательным.");
        }
        int hours = second / 3600;
        int minutes = second / 60;
        int seconds = second - minutes * 60;
        return new int[]{hours, minutes, seconds};
    }

    public static String whichIsCloserTo00(double x1, double y1, double x2, double y2) {    //7
        double distanceFromA = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double distanceFromB = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        if (distanceFromA > distanceFromB) {
            return "точка A";
        } else if (distanceFromA < distanceFromB) {
            return "точка B";
        } else {
            return "точки расположены одинаково близко к началу координат.";
        }
    }

    public static double function(double x) {                                               //8
        if (x >= 3) {
            return -Math.pow(x, 2) + 3 * x + 9;
        } else {
            return 1 / (Math.pow(x, 3) - 6);
        }
    }

    public static double circumference(double R) throws Exception {                         //9
        if (R <= 0) {
            throw new Exception("Радиус не может быть отрицательным или равным 0.");
        }
        return 2 * Math.PI * R;
    }

    public static double square(double R) throws Exception {
        if (R <= 0) {
            throw new Exception("Радиус не может быть отрицательным или равным .");
        }
        return Math.PI * Math.pow(R, 2);
    }

    public static Map<Double, Double> tang(double a, double b, double h) {                    //10                       //10
        Map<Double, Double> results = new HashMap<Double, Double>();
        double function;
        for (double i = a; i <= b; i += h) {
            function = Math.tan(i);
            results.put(i, function);
        }
        return results;
    }
}
