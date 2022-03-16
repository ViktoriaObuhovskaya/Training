/*2. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
(b+sqrt(b^2+4*a*c))/(2*a) - a^3*c+ b^-2
 */

package main.java.lesson1.unit1.task2;

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


        double temp = b * b + 4 * a * c;
        if (temp >= 0 && a != 0 && b != 0) {
            System.out.println(((b + Math.sqrt(temp)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2)));
        } else {
            System.out.println("Error");
        }
    }
}

