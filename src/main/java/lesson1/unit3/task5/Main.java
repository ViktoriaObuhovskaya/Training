/*5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 Общий член ряда имеет вид a_n=1/2^n +1/3^n
*/

package main.java.lesson1.unit3.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter e:");
        double e = in.nextDouble();

        int n = 0;
        double sum = 0;
        for (int i = 0; i <= 10; i++) {
            ++n;
            System.out.print("\n");
            double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            System.out.printf("%.4f", a);
            if (e <= Math.abs(a)) {
                sum = sum + a;
            }
        }
        if (sum != 0) {
            System.out.println("\nsum = " + sum);
        } else {
            System.out.println("\nno elements greater than or equal to e");
        }
    }
}


