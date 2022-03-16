//   1. Найдите значение функции: z = ((a – 3 ) * b / 2) + c

package main.java.lesson1.unit1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = in.nextDouble();
        System.out.println("Enter b:");
        double b = in.nextDouble();
        System.out.println("Enter c:");
        double c = in.nextDouble();

        System.out.println(((a - 3) * b / 2) + c);
    }
}




