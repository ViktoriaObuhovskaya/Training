/*4.  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
   Поменять местами дробную и целую части числа и вывести полученное значение числа.
*/

package main.java.lesson1.unit1.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        double number = in.nextDouble();

        System.out.println((number * 1000) % 1000 + (int) number / 1000.0);

    }
}

