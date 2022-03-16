//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

package main.java.lesson2.unit2.task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][20];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 16));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.printf("%nLine №%d ", i + 1);
            }
            count = 0;
        }
    }
}

