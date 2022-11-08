package HomeWork5;

public class HomeWork5Task2 {
    public static void main(String[] args) {
        int[] array = {3, 5, 0, 1, 1, 3, 5, 2, 2, 2, 4};

        int arraySize = array.length;
        int counter;

        for (int index = 0; index != arraySize; index++, arraySize = counter) {
            for (int nextIndex = counter = index + 1; nextIndex != arraySize; nextIndex++) {
                if (array[nextIndex] != array[index]) {
                    if (counter != nextIndex)
                        array[counter] = array[nextIndex];
                    counter++;
                }
            }
        }
        if (arraySize != array.length) {
            int[] newArray = new int[arraySize];
            for (int index = 0; index < arraySize; index++)
                newArray[index] = array[index];
            array = newArray;
        }

        for (int x : array) System.out.print(x + " ");
        System.out.println();
    }
}




