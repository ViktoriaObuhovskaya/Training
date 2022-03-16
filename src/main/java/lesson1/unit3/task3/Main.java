//3.Найти сумму квадратов первых ста чисел.

package main.java.lesson1.unit3.task3;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("Result: " + sum);
    }
}


