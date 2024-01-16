package dynamicProgram.easy;

import java.util.Arrays;

// https://leetcode.com/problems/pascals-triangle/description/
public class PascalTriangle {
    public static void main(String[] args){
        int numRows = 5;
        System.out.println(Arrays.toString(pascalTriangle(numRows)));
    }

    private static int[][] pascalTriangle(int numRows){
        int[][] result = new int[1][numRows];
        for (int i = 1; i <= numRows; i++){
            result[i - 1] = calculatePascalTriangle(i);
        } return result;
    }

    private static int[] calculatePascalTriangle(int numRow){
        int[] row = new int[numRow];
        return new int[]{1,1};
    }
}
