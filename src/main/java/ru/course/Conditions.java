package ru.course;

public class Conditions {
    public static int abs(int x){
        if (x > 0) return x;
        return -x;
    }
    public static double safeDiv(int x, int y){
        if (y == 0) return 0;
        return (double) x / y;
    }
    public static int max(int x, int y){
        if (x > y) return x;
        return y;
    }
    public static String makeDecision(int x, int y){
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }
    public static int max3(int x, int y, int z){
        if (x > y && x > z) return x;
        if (y > x && y > z) return y;
        return z;
    }
    public static boolean sum3(int x, int y, int z){
        return (x + y == z) || (x + z == y) || (y + z == x);
    }
    public static int sum2(int x, int y){
        int res = x + y;
        if ((res >= 10) && (res <= 19)) return 20;
        return res;
    }
    public static boolean is35(int x){
        if ((x % 3 == 0) && (x % 5 == 0)) return false;
        return (x % 3 == 0) || (x % 5 == 0);
    }
    public static boolean magic6(int x, int y){
        return (x == 6) || (y == 6) || (x + y == 6) || (x - y == 6);
    }
    public static String age(int x){
        int a = x % 10;
        int b = x % 100;
        if (b >= 11 && b <= 14) return x + " лет";
        if (a == 1) return x + " год";
        if (a == 2 || a == 3 || a == 4) return x + " года";
        return x + " лет";
    }
    public static String day(int x){
        return switch (x) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "это не день недели";
        };
    }
    public static void printDays(String x){
        switch (x) {
            case "Понедельник":
                System.out.println("Понедельник");
            case "Вторник":
                System.out.println("Вторник");
            case "Среда":
                System.out.println("Среда");
            case "Четверг":
                System.out.println("Четверг");
            case "Пятница":
                System.out.println("Пятница");
            case "Суббота":
                System.out.println("Суббота");
            case "Воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("это не день недели");

        }
    }
}
