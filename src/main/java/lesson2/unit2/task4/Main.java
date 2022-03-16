//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

package main.java.lesson2.unit2.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Create a square matrix of order n(n is even). Enter n:");
        int n = in.nextInt();
        int[][] array = new int[n][n];

        if (n % 2 == 0) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i % 2 == 0) {
                        array[i][j] = j + 1;
                    } else {
                        array[i][j] = -(j - n);
                    }
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("number n is odd");
        }
    }
}



