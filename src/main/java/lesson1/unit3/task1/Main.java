//1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.

package main.java.lesson1.unit3.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = in.nextInt();

        int sum = 0;
        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
