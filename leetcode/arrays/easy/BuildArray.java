package arrays.easy;

import java.util.Arrays;

// https://leetcode.com/problems/build-array-from-permutation/
public class BuildArray {
    public static void main(String[] args){
        int[] arrayAux = new int[] {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(arrayAux)));
    }

    private static int[] buildArray(int[] arrayAux){
        int[] result = new int[arrayAux.length];
        for (int i = 0; i < arrayAux.length; i++){
            result[i] = arrayAux[arrayAux[i]];
        } return result;
    }
}
