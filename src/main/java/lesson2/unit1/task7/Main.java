//7. Даны действительные числа a_1,a_2,...,a_n. Найти max(a_1+a_2n,a_2+a_2n-1,...,a_n+a_n+1)

package main.java.lesson2.unit1.task7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
        }
        System.out.print(Arrays.toString(array) + " ");

        int max = array[0] + array[array.length - 1];
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i] + array[array.length - 1 - i];
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(max);
    }
}


