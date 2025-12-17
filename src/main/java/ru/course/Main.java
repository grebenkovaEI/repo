package ru.course;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите соответствующую цифру:\n" + "1 - ДЗ по теме Классы и методы\n" +
                "2 - ДЗ по теме Условия\n" + "3 - ДЗ по теме Циклы");
        int menu = sc.nextInt();
        switch (menu) {
            case 1 -> dzClassesAndMethods();
            case 2 -> dzConditions();
            case 3 -> dzLoops();
        }
    }

    public static void dzLoops(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Введите число (от 0 и выше): ");
        int num1 = sc.nextInt();
        System.out.println("Все числа от 0 до " + num1 + ":\n" + Loops.listNums(num1));

        System.out.println("2. Введите число (от 0 и выше): ");
        int num2 = sc.nextInt();
        System.out.println("Все числа от " + num2 + " до 0:\n" + Loops.reverseListNums(num2));

        System.out.println("3. Введите число: ");
        int num3 = sc.nextInt();
        System.out.println("Четные числа от 0 до " + num3 + ":\n" + Loops.chet(num3));

        System.out.println("4. Введите число x: ");
        int num4 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num5 = sc.nextInt();
        System.out.println("Число " + num4 + " в степени " + num5 + " = " + Loops.pow(num4, num5));
    }

    public static void dzConditions(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Введите число: ");
        int num7 = sc.nextInt();
        System.out.println("Модуль числа " + num7 + " = " + Conditions.abs(num7));

        System.out.println("2. Введите число x: ");
        int num8 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num9 = sc.nextInt();
        System.out.println("Результат деления x/y: " + Conditions.safeDiv(num8, num9));

        System.out.println("3. Введите число x: ");
        int num10 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num11 = sc.nextInt();
        System.out.println("Максимальное значение: " + Conditions.max(num10, num11));

        System.out.println("4. Введите число x: ");
        int num12 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num13 = sc.nextInt();
        System.out.println("Результат сравнения: " + Conditions.makeDecision(num12, num13));

        System.out.println("5. Введите число x: ");
        int num14 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num15 = sc.nextInt();
        System.out.println("Введите число z: ");
        int num16 = sc.nextInt();
        System.out.println("Максимальное число: " + Conditions.max3(num14, num15, num16));

        System.out.println("6. Введите число x: ");
        int num17 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num18 = sc.nextInt();
        System.out.println("Введите число z: ");
        int num19 = sc.nextInt();
        System.out.println("Два любых числа можно сложить так, чтобы получить третье?: " + Conditions.sum3(num17, num18, num19));

        System.out.println("7. Введите число x: ");
        int num20 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num21 = sc.nextInt();
        System.out.println("Результат сложения: " + Conditions.sum2(num20, num21));

        System.out.println("8. Введите число x: ");
        int num22 = sc.nextInt();
        System.out.println("Проверка: число делится нацело на 3 или 5? Результат: " + Conditions.is35(num22));

        System.out.println("9. Введите число x: ");
        int num23 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num24 = sc.nextInt();
        System.out.println("Проверка: x=6 или y=6 или x+y=6 или x-y=6. Результат: " + Conditions.magic6(num23, num24));

        System.out.println("10. Введите число x: ");
        int num25 = sc.nextInt();
        System.out.println("Число + год/года/лет. Результат: " + Conditions.age(num25));

        System.out.println("11. Введите число x: ");
        int num26 = sc.nextInt();
        System.out.println("Число + год/года/лет. Результат: " + Conditions.day(num26));

        System.out.println("12. Введите день недели: ");
        String str = sc.nextLine();
        Conditions.printDays(str);
    }

    public static void dzClassesAndMethods(){
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

