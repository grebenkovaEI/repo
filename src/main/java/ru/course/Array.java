package ru.course;

import java.util.Arrays;

public class Array {
    public static int findFirst(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }
    public static int findLast(int[] arr, int x){
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }
    public static int maxAbs(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < Math.abs(arr[i])) max = arr[i];
        }
        return max;
    }
    public static int countPositive(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }
        return count;
    }
    public static boolean palindrom(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) return false;
        }
        return true;
    }
    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int[] reverseBack(int[] arr){
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }
}
