/*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
  Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc
*/

package main.java.lesson1.unit1.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of seconds :");
        int number = in.nextInt();

        int seconds = number % 60;
        int temp = (number - seconds) / 60;
        int minutes = temp % 60;
        int hours = (temp - minutes) / 60;
        System.out.println(hours + "ч. " + minutes + "мин. " + seconds + "с.");
    }
}
