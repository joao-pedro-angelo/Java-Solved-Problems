package arrays.medium;

import java.util.Arrays;

// https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/
public class PrefixXor {
    public static void main(String[] args){
        System.out.println(Arrays.toString(prefixXor(new int[] {5, 2, 0, 3, 1})));
    }

    private static int[] prefixXor(int[] array){
        int[] result = new int[array.length];
        result[0] = array[0];
        for (int i = 1; i < result.length; i++){
            result[i] = array[i] ^ array[i - 1];
        } return result;
    }
}
