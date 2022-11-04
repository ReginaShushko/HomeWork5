package HomeWork5;

import java.util.Arrays;

public class HomeWork5Task2 {
    public static void main(String[] args) {
        int[] array = {3, 5, 0, 1, 1, 3, 5, 2, 2, 2, 4};

        Arrays.sort(array);
        int counter = 0;
        for (int index = 0; index < array.length; index++) {
            if (index == 0 || array[index] != array[index - 1]) {
                array[counter++] = array[index];
                System.out.println(array[index]);
            }
        }
    }
}



