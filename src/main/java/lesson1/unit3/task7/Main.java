// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры

package main.java.lesson1.unit3.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter m:");
        int m = in.nextInt();
        System.out.println("Enter n:");
        int n = in.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("Error");
        } else if (m < n) {
            for (int i = m; i <= n; i++) {
                System.out.println("Number " + i);
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        System.out.println("Divisors " + j + " ");
                    }
                }
                System.out.println();
            }
        } else if (m > n) {
            for (int i = n; i <= m; i++) {
                System.out.println("Number " + i);
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        System.out.println("Divisors " + j + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}


