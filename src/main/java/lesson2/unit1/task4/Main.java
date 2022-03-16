//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

package main.java.lesson2.unit1.task4;

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

        int max = 0;
        int min = 0;
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (array[max] < array[i])
                max = i;
            if (array[min] > array[i])
                min = i;
        }
        System.out.println("max " + array[max] + " min " + array[min]);
        temp = array[max];
        array[max] = array[min];
        array[min] = temp;
        System.out.println(Arrays.toString(array) + " ");
    }
}


