//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

package main.java.lesson1.unit3.task6;

public class Main {
    public static void main(String[] args) {
        for (int i = 33; i <= 255; i++) {
            System.out.println(i + " " + (char) i);
        }
    }
}
