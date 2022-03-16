/*7. Сформировать квадратную матрицу порядка N по правилу:
A[i,j]=sin( (i^2-j^2)/N)
и подсчитать количество положительных элементов в ней
*/

package main.java.lesson2.unit2.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Create a square matrix of order n. Enter n:");
        int n = in.nextInt();
        double[][] array = new double[n][n];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.sin((i * i - j * j) / n);
                if (array[i][j] > 0) {
                    count++;
                }
                System.out.printf("%10f", array[i][j]);
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
