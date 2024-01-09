package arrays.easy;

// https://leetcode.com/problems/number-of-good-pairs/
public class NumberOfGoodPairs {
    public static void main(String[] args){
        int[] arrayAux = new int[] {1, 2, 3, 1, 1, 3};
        System.out.println(numberOfGoodPairs(arrayAux));
    }

    private static int numberOfGoodPairs(int[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]) result++;
            }
        } return result;
    }
}
