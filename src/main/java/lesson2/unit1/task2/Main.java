//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

package main.java.lesson2.unit1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Enter number z:");
        int z = in.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                ++count;
            }
        }
        System.out.print("Number of substitutions " + count);
    }
}
