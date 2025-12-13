package ru.course;

public class IsUpperCase {
    public static boolean isUpperCase(char x){
        boolean res = 'A' <= x && x <= 'Z';
        return res;
    }
}
