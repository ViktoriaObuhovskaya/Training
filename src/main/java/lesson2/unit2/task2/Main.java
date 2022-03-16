//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

package main.java.lesson2.unit2.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Create a square matrix of order n. Enter n:");
        int n = in.nextInt();

        int[][] array = new int[n][n];

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
                if (array[i] == array[j]) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}
