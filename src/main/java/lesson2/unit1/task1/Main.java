//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

package main.java.lesson2.unit1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Enter number k:");
        int k = in.nextInt();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");

            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println("\n" + "The sum of elements that are multiples of k=" + k + " is " + sum);
    }
}
