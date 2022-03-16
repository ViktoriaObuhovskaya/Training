// 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным

package main.java.lesson1.unit2.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //значения в градусах
        System.out.println("Enter x:");
        double x = in.nextDouble();
        System.out.println("Enter y:");
        double y = in.nextDouble();

        if (x + y >= 180 || x <= 0 || y <= 0) {
            System.out.println("Triangle does not exist");
        } else {
            System.out.println("Triangle exists");
            if (x == 90 || y == 90 || 180 - x - y == 90) {
                System.out.println("Triangle rectangular");
            }
        }
    }
}
