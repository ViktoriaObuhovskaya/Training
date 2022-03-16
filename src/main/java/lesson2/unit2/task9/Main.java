//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.

package main.java.lesson2.unit2.task9;

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
        int sum = 0;
        int maxColumn = 1;
        int maxSum = 0;
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            System.out.printf("%nSum of elements in column is №%d: %d", j + 1, sum);
            if (sum > maxSum) {
                maxSum = sum;
                maxColumn = j + 1;
            }
            sum = 0;
        }
        System.out.printf("\n\nMax sum in column №%d.", maxColumn);
    }
}






