package ru.course;

public class IsInRange {
    public static boolean isInRange(int a, int b, int num){
        boolean res = (a <= num && num <= b) || (a >= num && num >= b);
        return res;
    }
}
