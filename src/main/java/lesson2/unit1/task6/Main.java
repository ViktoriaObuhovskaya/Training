//6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.

package main.java.lesson2.unit1.task6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n = in.nextInt();
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100 - 50;
            array[i] = (double) Math.round(array[i] * 100d) / 100d;
        }
        System.out.print(Arrays.toString(array) + " ");

        double sum = 0;
        temp:
        for (int i = 2; i < array.length; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue temp;
                }
            }
            sum += array[i];
            System.out.println("\n" + "Prime number " + i + " array element " + array[i]);
        }
        System.out.println("sum= " + sum);
    }
}

