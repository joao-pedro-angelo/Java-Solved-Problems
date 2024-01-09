package arrays.easy;

import java.util.Arrays;

// https://leetcode.com/problems/concatenation-of-array/
public class Concatenation {
    public static void main(String[] args){
        int[] arrayAux01 = {1, 2, 1};
        int[] arrayAux02 = {1, 3, 4, 2};

        System.out.println(Arrays.toString(concatenation(arrayAux01)));
        System.out.println(Arrays.toString(concatenation(arrayAux02)));
    }

    private static int[] concatenation(int[] array){
        int[] result = new int[array.length * 2];
        for (int i = 0; i < array.length; i++){
            result[i] = array[i];
            result[i + array.length] = array[i];
        } return result;
    }
}
