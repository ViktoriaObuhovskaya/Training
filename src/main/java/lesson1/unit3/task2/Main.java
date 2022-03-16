//2.Вычислить значения функции на отрезке [а,b] c шагом h:x,x>2;-x,x<=2

package main.java.lesson1.unit3.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter [а,b]:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Enter h:");
        double h = in.nextDouble();
        double y;
        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = -i;
            }
            System.out.println("x=" + i + " " + "y=" + y);
        }
    }
}