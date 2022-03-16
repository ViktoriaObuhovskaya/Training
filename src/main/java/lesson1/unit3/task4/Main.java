//4.Составить программу нахождения произведения квадратов первых двухсот чисел

package main.java.lesson1.unit3.task4;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger mul = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            mul = mul.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println("Multiplication result " + mul);
    }
}
