//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

package main.java.lesson2.unit2.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n = in.nextInt();
        System.out.println("Enter the number of columns:");
        int m = in.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 100));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Result:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 == 0 && array[0][j] > array[n - 1][j]) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

