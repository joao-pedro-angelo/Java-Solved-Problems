package dynamicProgram.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/description/
public class PascalTriangle {
    public static void main(String[] args){
        int numRows = 5;
        System.out.println(generate(numRows));
    }

    private static List<List<Integer>> generate(int numRows){
        List<List<Integer>> listPascal = new ArrayList<>();
        for (int i = 1; i <= numRows; i++){
            int[] row = new int[i];
            row[0] = 1;
            row[row.length - 1] = 1;

            for (int j = 1; j < row.length - 1; j++){
                row[j] = listPascal.get(i - 2).get(j - 1) + listPascal.get(i - 2).get(j);
            }

            List<Integer> rowList = new ArrayList<>();
            for (int number : row){
                rowList.add(number);
            } listPascal.add(rowList);

        } return listPascal;
    }
}
