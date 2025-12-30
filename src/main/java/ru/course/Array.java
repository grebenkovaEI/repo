package ru.course;

public class Array {
    public static int findFirst(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }
}
