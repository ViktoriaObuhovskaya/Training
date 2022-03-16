/*8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
*/

package main.java.lesson2.unit2.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int k = in.nextInt();
        System.out.println("Enter the number of columns:");
        int p = in.nextInt();
        int[][] array = new int[k][p];
        System.out.println("Enter the number of the first column to change:");
        int p1 = in.nextInt();
        System.out.println("Enter the number of the second column to change:");
        int p2 = in.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 100));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("result:");
        int temp;
        for (int i = 0; i < array.length; i++) {
            temp = array[i][p1 - 1];
            array[i][p1 - 1] = array[i][p2 - 1];
            array[i][p2 - 1] = temp;

        }
        for (int[] arr : array) {
            for (int element : arr) {
                System.out.printf("%3d ", element);
            }
            System.out.println();
        }
    }
}

