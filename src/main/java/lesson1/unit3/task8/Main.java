//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

package main.java.lesson1.unit3.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number1:");
        String number1 = in.nextLine();
        System.out.println("Enter number2:");
        String number2 = in.nextLine();

        for (int f = 0; f < number1.length(); f++) {
            number1.charAt(f);
        }
        for (int g = 0; g < number2.length(); g++) {
            number2.charAt(g);
        }
        System.out.println("The same numbers from two lines: ");
        for (int i = 0; i < number1.length(); i++) {
            for (int j = 0; j < number2.length(); j++) {
                if (number1.charAt(i) == number2.charAt(j)) {
                    System.out.print(number2.charAt(j) + "\n");
                }
            }
        }
    }
}
