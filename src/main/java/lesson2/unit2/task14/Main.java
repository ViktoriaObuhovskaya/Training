//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца

package main.java.lesson2.unit2.task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int m = in.nextInt();
        System.out.println("Enter the number of columns:");
        int n = in.nextInt();
        int[][] array = new int[m][n];

        if (m >= n) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                count++;
                for (int j = 0; j < array[i].length; j++) {
                    if (count - 1 <= j) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 0;
                    }
                    System.out.print(array[i][j] + " ");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Error");
        }
    }
}








