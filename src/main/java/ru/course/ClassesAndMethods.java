package ru.course;

public class ClassesAndMethods {
    public static double fraction(double x){
        int intPart = (int)x;
        double res = x - intPart;
        return res;
    }
    public static int sumLastNums(int x){
        int num1 = x % 10;
        int num2 = (x/10) % 10;
        int res = num1 + num2;
        return res;
    }
    public static int charToNum(char x){
        int res = x - '0';
        return res;
    }
    public static boolean isPositive(int x){
        boolean res = x > 0;
        return res;
    }
    public static boolean is2Digits(int x){
        boolean res = 9 < x && x < 100;
        return res;
    }
    public static boolean isUpperCase(char x){
        boolean res = 'A' <= x && x <= 'Z';
        return res;
    }
    public static boolean isInRange(int a, int b, int num){
        boolean res = (a <= num && num <= b) || (a >= num && num >= b);
        return res;
    }
    public static boolean isDivisor (int a, int b){
        boolean res = ((a % b) == 0) || ((b % a) == 0);
        return res;
    }
    public static boolean isEqual (int a, int b, int c){
        boolean res = a == b && b == c;
        return res;
    }
    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }
}
