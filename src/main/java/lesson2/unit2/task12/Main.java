//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

package main.java.lesson2.unit2.task12;

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
        System.out.println("descending sort");
        boolean sorted;
        int temp;
        for (int i = 0; i < array.length; i++) {
            sorted = false;
            while (!sorted) {
                sorted = true;
                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[i][j] < array[i][j + 1]) {
                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }
        for (int[] arr : array) {
            for (int element : arr) {
                System.out.printf("%3d ", element);
            }
            System.out.println();
        }
        System.out.println("ascending sort");

        for (int i = 0; i < array.length; i++) {
            sorted = false;
            while (!sorted) {
                sorted = true;
                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[i][j] > array[i][j + 1]) {
                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }
        for (int[] arr : array) {
            for (int element : arr) {
                System.out.printf("%3d ", element);
            }
            System.out.println();
        }
    }
}



