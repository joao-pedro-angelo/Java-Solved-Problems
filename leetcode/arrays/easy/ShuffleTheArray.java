package arrays.easy;

import java.util.Arrays;

// https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {
    public static void main(String[] args){
        int[] array = new int[] {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(shuffleTheArray(array, n)));
    }

    private static int[] shuffleTheArray(int[] array, int n){
        int[] result = new int[array.length];
        int positionP = 0;
        int positionI = 1;
        int aux = n;
        for(int i = 0; i < n; i++){
            result[positionP] = array[i];
            result[positionI] = array[aux];
            positionI += 2;
            positionP += 2;
            aux += 1;
        } return result;
    }
}
