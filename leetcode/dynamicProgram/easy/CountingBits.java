package dynamicProgram.easy;

import java.util.Arrays;

// https://leetcode.com/problems/counting-bits/description/
public class CountingBits {
    public static void main(String[] args){
        int number = 5;
        System.out.println(Arrays.toString(countingBits(number)));
    }

    private static int[] countingBits(int number){
        int[] result = new int[number + 1];
        for (int i = 0; i <= number; i++){
            result[i] = binaryCountingOne(i);
        } return result;
    }

    private static int binaryCountingOne(int i){
        int binary = binaryRepresentation(i);
        int countingOne = 0;

        while (binary != 0){
            int digit = binary % 10;
            if (digit == 1) countingOne++;
            binary = binary / 10;
        } return countingOne;
    }

    private static int binaryRepresentation(int i){
        if (i == 0) return 0;
        StringBuilder result = new StringBuilder();

        while (i != 0){
            result.append(i % 2);
            i = i / 2;
        } return Integer.parseInt(result.toString() + "0");
    }
}
