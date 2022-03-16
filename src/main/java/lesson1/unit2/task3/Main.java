//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой

package main.java.lesson1.unit2.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter А(х1,у1):");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.println("Enter В(х2,у2):");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        System.out.println("Enter С(х3,у3):");
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        if (((x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3)) == 0) {
            System.out.println("The points are on the same line");
        } else {
            System.out.println("The points aren't on the same line");
        }
    }
}
