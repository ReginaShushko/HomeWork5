package HomeWork5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork5Task4 {
    public static void main(String[] args) {
        System.out.println("Enter array size");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) { // 0 на главной диагонали
            array[i][i] = 0;
            for (i = 0; i < n; i++) { // 0 на побочной диагонали
                for (int j = 0; j < n; j++) {
                    array[i][n - i - 1] = 0;
                    if (i + j == n - 1)
                        array[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < (n - 1) / 2; i++) { // треугольник выше главной диагонали, положительные числа
            for (int j = i + 1; j < n - i - 1; j++) {
                array[i][j] = random.nextInt(9) + 1;
            }
        }
        for (int i = 0; i < (n - 1) / 2; i++) { // треугольник слева, ниже главной диагонали, отрицательные числа
            for (int j = i + 1; j < n - i - 1; j++) {
                array[j][i] = random.nextInt(9) - 10;
            }
        }
        for (int i = n - 1; i > (n - 1) / 2 - 1; i--) { // треугольник низ
            for (int j = i - 1; j > n - i - 1; j--) {
                array[i][j] = random.nextInt(9) + 1;
            }
        }
        for (int i = n - 1; i > (n - 1) / 2 - 1; i--) { // треугольник право
            for (int j = i - 1; j > n - i - 1; j--) {
                array[j][i] = random.nextInt(9) - 10;
            }
        }
        for (int[] row : array) {
            if (row != null) {
                for (int col : row) {
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
    }
}
