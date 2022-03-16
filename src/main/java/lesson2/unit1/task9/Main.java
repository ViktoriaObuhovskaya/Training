//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них

package main.java.lesson2.unit1.task9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(array) + " ");

        int count = 0;
        int howManyTimes = 1;
        int commonNumber = array[1];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (array[i] == array[j])
                    count++;
            }
            if (((howManyTimes == count) && (commonNumber > array[i])) || (howManyTimes < count)) {  //выбираем наименьшее из "одинаковых*
                commonNumber = array[i];
                howManyTimes = count;
            }
            count = 0; // сбрасываем счётчик

        }
        System.out.print("The most common smallest number = " + commonNumber +
                "\nHow many times does it meet = " + howManyTimes);

    }
}