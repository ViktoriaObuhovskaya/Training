/*3. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
( (sinx + cosx)/(cosx-siny) ) * tg(x*y);
 */

package main.java.lesson1.unit1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //значения в градусах
        System.out.println("Enter x:");
        double x = in.nextDouble();
        System.out.println("Enter y:");
        double y = in.nextDouble();

        //перевод в радианы
        double xRad = Math.toRadians(x);
        double yRad = Math.toRadians(y);
        System.out.println(((Math.sin(xRad) + Math.cos(yRad)) / (Math.cos(xRad) - Math.sin(yRad))) * Math.tan(xRad * yRad));
    }
}