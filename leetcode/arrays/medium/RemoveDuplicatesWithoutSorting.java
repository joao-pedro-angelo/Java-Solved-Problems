package arrays.medium;

import java.util.Arrays;

// https://www.codementor.io/@noelkamphoa/5-effective-methods-to-remove-array-duplicates-while-preserving-original-order-2bff62aydc
public class RemoveDuplicatesWithoutSorting {
    public static void main(String[] args){
        System.out.println(Arrays.toString(removeDuplicatesInPlace(new int[] {1, 1, 3, 3, 0, 0, 2, 2, 1})));
    }

    private static int[] removeDuplicatesInPlace(int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                array[index++] = array[i];
            }
        }

        return Arrays.copyOf(array, index);
    }
}
