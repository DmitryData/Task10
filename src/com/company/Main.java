package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in;

    public static void main(String[] args) {

        int i = 0;

        in = new Scanner(System.in);
        int[] arrVal = new int[3];
        System.out.println("Введите числа: ");

        for (int n = 0; n <= 2; n++){
            testingInput();
            arrVal[n] = in.nextInt();
        }

        if (arrVal[i] == arrVal[i+1] && arrVal[i] == arrVal[i+2]){
            allIndexesEquals(arrVal, i);
        } else if (arrVal[i] == arrVal[i+1]){
            twoFirstIndexesEqual(arrVal, i);
        } else if (arrVal[i] == arrVal[i+2]){
            twoFirstAndLastIndexesEqual(arrVal, i);
        } else if (arrVal[1] == arrVal[i+2]){
            twoLastIndexesEqual(arrVal, i);
        } else {
            allDifferent(arrVal, i);
        }
    }

    private static void twoFirstAndLastIndexesEqual(int[] arrVal, int i) {
        System.out.println("Первое и последнее число одинаковые, количество комбинаций: 3");
        System.out.println(arrVal[i+1] + "" + arrVal[i] + "" + arrVal[i+2]);
        System.out.println(arrVal[i] + "" + arrVal[i+2] + "" + arrVal[i+1]);
    }

    private static void twoFirstIndexesEqual(int[] arrVal, int i) {
        System.out.println("Два первые числа одинаковы, количество комбинаций: 3");
        System.out.println(arrVal[i+2] + "" + arrVal[i+1] + "" + arrVal[i]);
        System.out.println(arrVal[i+2] + "" + arrVal[i+1] + "" + arrVal[i]);
    }

    private static void twoLastIndexesEqual(int[] arrVal, int i) {
        System.out.println("Последнее и предпоследнее числа одинаковы, количество комбинаций: 3");
        System.out.println(arrVal[i+2] + "" + arrVal[i+1] + "" + arrVal[i]);
        System.out.println(arrVal[i+2] + "" + arrVal[i] + "" + arrVal[i+1]);
    }

    private static void allIndexesEquals(int[] arrVal, int i) {
        System.out.println("Из этого числа больше не получится составить комбинации");
        System.out.println(arrVal[i] + " " + arrVal[i+1] + " " + arrVal[i+2]);
    }

    private static void allDifferent(int[] arrVal, int i) {
        System.out.println("Все цифры разные, количество комбинаций: 6");
        System.out.println(arrVal[i] + "" + arrVal[i+2] + "" + arrVal[i+1]);
        System.out.println(arrVal[i] + "" + arrVal[i+1] + "" + arrVal[i+2]);
        System.out.println(arrVal[i+1] + "" + arrVal[i+1] + "" + arrVal[i]);
        System.out.println(arrVal[i+1] + "" + arrVal[i] + "" + arrVal[i+1]);
        System.out.println(arrVal[i+2] + "" + arrVal[i] + "" + arrVal[i+1]);
        System.out.println(arrVal[i+2] + "" + arrVal[i+1] + "" + arrVal[i]);
    }

    private static void testingInput() {
        while(!in.hasNextLong()) {
            System.out.println("Ошибка ввода, надо вводить числа");
            in.next();
        }
    }

}
