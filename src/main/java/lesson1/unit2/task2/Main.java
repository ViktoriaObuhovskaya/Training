//2. Найти max{min(a, b), min(c, d)}

package main.java.lesson1.unit2.task2;

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
        System.out.println("Enter d:");
        double d = in.nextDouble();

        double min1 = Math.min(a, b);
        double min2 = Math.min(c, d);
        System.out.println(Math.max(min1, min2));
    }
}
