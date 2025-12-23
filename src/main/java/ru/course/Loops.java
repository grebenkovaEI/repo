package ru.course;

public class Loops {
    public static String listNums(int x){
        String res = "";
        for (int i = 0; i <= x; i++){
            res += i + " ";
        }
        return res;
    }
    public static String reverseListNums(int x){
        String res = "";
        for (int i = x; i >= 0; i--){
            res += i + " ";
        }
        return res;
    }
    public static String chet(int x){
        String res = "";
        for (int i = 0; i <= x; i += 2){
            res += i + " ";
        }
        return res;
    }
    public static int pow(int x, int y){
        int res = 1;
        for (int i = 0; i < y; i++){
            res *= x;
        }
        return res;
    }
    public static int numLen(long x){
        int count = 0;
        for (; x > 0; x /= 10) {
            count++;
        }
        return count;
    }
    public static boolean equalNum(int x){
        int y = x % 10;
        x /= 10;
        for (; x > 0; x /= 10) {
            int num = x % 10;
            if (num != y) return false;
        }
        return true;
    }
    public static void square(int x){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void leftTriangle(int x){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rightTriangle(int x){
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void guessGame() {
        int randomNum = 3;
        int count = 0;
        int x;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        do {
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
            }
            count++;
        } while (x != randomNum);
        System.out.println("Количество попыток: " + count);
    }
}
