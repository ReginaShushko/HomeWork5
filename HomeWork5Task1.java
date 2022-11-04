package HomeWork5;

import java.util.Arrays;
import java.util.Random;

public class HomeWork5Task1 {
    public static void main(String[] args) {
        int index;
        int nextIndex;
        int arraySize = 10;

        Random random = new Random();
        int[] array = new int[arraySize];

        for (index = 0; index < array.length; ) {
            int randomNumber = random.nextInt(arraySize) + 1;

            for (nextIndex = 0; nextIndex < index; nextIndex++) {
                if (array[nextIndex] == randomNumber) {
                    break;
                }
            }
            if (nextIndex == index) {
                array[index] = randomNumber;
                System.out.println(array[index] + " ");
                index++;
            }
        }
        Arrays.sort(array);
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println("Min even number: " + i);
                break;
            }
        }
        for (int j : array) {
            if (j % 2 > 0) {
                System.out.println("Min odd number: " + j);
                break;
            }
        }
        System.out.println("Max value: " + array[9]);
    }
}


