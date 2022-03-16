//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

package main.java.lesson2.unit2.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int k = in.nextInt();
        System.out.println("Enter the number of columns:");
        int p = in.nextInt();
        int[][] array = new int[k][p];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 100));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("k-th line");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i] == array[k - 1]) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println("\np-th column");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[0][j] == array[0][p - 1]) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}
