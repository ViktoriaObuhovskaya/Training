//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

package main.java.lesson2.unit2.task15;

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
        int max = array[0][0];

        for (int[] arr : array) {
            for (int element : arr) {
                if (element > max) {
                    max = element;
                }
            }
        }
        System.out.println("Result:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}



