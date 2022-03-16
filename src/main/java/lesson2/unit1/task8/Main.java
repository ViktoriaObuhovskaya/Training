/* 8.Дана последовательность целых чисел a_1,a_2,...,a_n . Образовать новую последовательность, выбросив из исходной те члены, которые равны )
 min( a_1,a_2...a_n) .
*/

package main.java.lesson2.unit1.task8;

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

        int min = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
                count = 1;
            } else if (array[i] == array[min]) {
                count++;
            }
        }
        System.out.println("\n" + "min element " + array[min]);
        System.out.println("count min element " + count);

        int[] array2 = new int[array.length - count];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (array[i] != array[min]) {
                array2[j] = array[i];
            } else {
                j--;
            }
        }
        System.out.println(Arrays.toString(array2) + " ");
    }
}



