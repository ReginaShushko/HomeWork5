package HomeWork5;

public class HomeWork5Task3 {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 5, 10, 21};
        int[] array2 = {3, 7, 8, 12, 20};

        int[] array3 = new int[array1.length + array2.length];

        int firstIndex = 0;
        int secondIndex = 0;
        for (int index = 0; index < array3.length; index++) {
            if (firstIndex >= array1.length) {
                array3[index] = array2[secondIndex];
                secondIndex += 1;
            } else if (secondIndex >= array2.length) {
                array3[index] = array1[firstIndex];
                firstIndex += 1;
            } else if (array1[firstIndex] < array2[secondIndex]) {
                array3[index] = array1[firstIndex];
                firstIndex += 1;
            } else {
                array3[index] = array2[secondIndex];
                secondIndex += 1;
            }
            System.out.print(array3[index] + " ");
        }
    }
}