package ru.course;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Введите число: ");
        double num1 = sc.nextDouble();
        System.out.println("Дробная часть числа: " + Math.round(FractionalPart.fraction(num1) * 1000.0)/ 1000.0);

        System.out.println("2. Введите число (2 и более знаков): ");
        int num2 = sc.nextInt();
        System.out.println("Сумма двух последних знаков числа: " + SumLastNums.sumLastNums(num2));

        System.out.println("3. Введите число от 0 до 9: ");
        char ch1 = sc.next().charAt(0);
        System.out.println("Результат преобразования символа в число: " + CharToNum.charToNum(ch1));

        System.out.println("4. Введите число: ");
        int num3 = sc.nextInt();
        System.out.println("Проверка: положительное - true, отрицательное - false. Результат: " + IsPositive.isPositive(num3));

        System.out.println("5. Введите положительное число: ");
        int num4 = sc.nextInt();
        System.out.println("Проверка: двузначное - true, недвузначное - false. Результат: " + Is2Digits.is2Digits(num4));

        System.out.println("6. Введите символ: ");
        char ch2 = sc.next().charAt(0);
        System.out.println("Проверка: Это большая буква в диапазоне от ‘A’ до ‘Z’. Результат: " + IsUpperCase.isUpperCase(ch2));
    }
}

