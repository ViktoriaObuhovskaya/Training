/* Вычислить значение функции:
    если x<=3 x^2-3x+9
    если x>3 1/(x^3+6)
 */

package main.java.lesson1.unit2.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = in.nextDouble();

        if (x <= 3) {
            System.out.println(Math.pow(x, 2) - 3 * x + 9);
        } else {
            System.out.println(1 / (Math.pow(x, 3) + 6));
        }
    }
}

