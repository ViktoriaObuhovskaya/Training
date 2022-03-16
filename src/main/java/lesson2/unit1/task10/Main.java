/* 10.Дан целочисленный массив с количеством элементов п.
 Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
*/

package main.java.lesson2.unit1.task10;

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

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("\n" + Arrays.toString(array) + " ");
    }
}

