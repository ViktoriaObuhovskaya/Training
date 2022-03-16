//4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие

package main.java.lesson1.unit2.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter х, у, z:");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        System.out.println("Enter a,b:");
        double a = in.nextDouble();
        double b = in.nextDouble();

        if ((x <= a && y <= b || y <= a && x <= b || x <= a && z <= b || z <= a && x <= b || z <= a && y <= b || y <= a && z <= b) &&
                (x > 0 && y > 0 && z > 0 && a > 0 && b > 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}