//3.Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

package main.java.lesson2.unit1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
            System.out.print(array[i] + " ");
        }

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int value : array) {
            if (value > 0) {
                ++countPositive;
            } else if (value < 0) {
                ++countNegative;
            } else {
                ++countZero;
            }
        }
        System.out.println("\n" + "Number of positive numbers " + countPositive);
        System.out.println("Number of negative numbers " + countNegative);
        System.out.println("Number of zero numbers " + countZero);
    }
}

