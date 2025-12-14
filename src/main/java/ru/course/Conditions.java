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
        if ((x + y == z) || (x + z == y) || (y + z == x)) return true;
        return false;
    }
}
