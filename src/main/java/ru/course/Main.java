package ru.course;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Введите число: ");
        double num1 = sc.nextDouble();
        System.out.println("Дробная часть числа: " + Math.round(ClassesAndMethods.fraction(num1) * 1000.0)/ 1000.0);

        System.out.println("2. Введите число (2 и более знаков): ");
        int num2 = sc.nextInt();
        System.out.println("Сумма двух последних знаков числа: " + ClassesAndMethods.sumLastNums(num2));

        System.out.println("3. Введите число от 0 до 9: ");
        char ch1 = sc.next().charAt(0);
        System.out.println("Результат преобразования символа в число: " + ClassesAndMethods.charToNum(ch1));

        System.out.println("4. Введите число: ");
        int num3 = sc.nextInt();
        System.out.println("Проверка: положительное - true, отрицательное - false. Результат: " + ClassesAndMethods.isPositive(num3));

        System.out.println("5. Введите положительное число: ");
        int num4 = sc.nextInt();
        System.out.println("Проверка: двузначное - true, недвузначное - false. Результат: " + ClassesAndMethods.is2Digits(num4));

        System.out.println("6. Введите символ: ");
        char ch2 = sc.next().charAt(0);
        System.out.println("Проверка: Это большая буква в диапазоне от ‘A’ до ‘Z’. Результат: " + ClassesAndMethods.isUpperCase(ch2));

        System.out.println("7. Введите первую границу диапазона: ");
        int a = sc.nextInt();
        System.out.println("Введите вторую границу диапазона: ");
        int b = sc.nextInt();
        System.out.println("Введите число для проверки принадлежности к диапазону: ");
        int num5 = sc.nextInt();
        System.out.println("Проверка: введенное число соответствует диапазону от " + a + " до " + b + ". Результат: " + ClassesAndMethods.isInRange(a,b,num5));

        System.out.println("8. Введите первое число: ");
        int a1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b1 = sc.nextInt();
        System.out.println("Проверка: любое из принятых чисел делит другое нацело. Результат: " + ClassesAndMethods.isDivisor(a1,b1));

        System.out.println("9. Введите первое число: ");
        int a2 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b2 = sc.nextInt();
        System.out.println("Введите третье число: ");
        int c2 = sc.nextInt();
        System.out.println("Проверка: все три полученных методом числа равны. Результат: " + ClassesAndMethods.isEqual(a2,b2,c2));

        System.out.println("10. Последовательное сложение чисел: 5, 11, 123, 14, 1");
        int num6 = ClassesAndMethods.lastNumSum(1, ClassesAndMethods.lastNumSum(14, ClassesAndMethods.lastNumSum(123, (ClassesAndMethods.lastNumSum(5, 11)))));
        System.out.println("Итого: " + num6);
    }
}

