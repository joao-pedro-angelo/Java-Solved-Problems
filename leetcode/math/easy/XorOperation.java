package math.easy;

// https://leetcode.com/problems/xor-operation-in-an-array/description/
public class XorOperation {
    public static void main(String[] args){
        int n = 4;
        int start = 3;
        System.out.println(xorOperation(n, start));
    }

    private static int xorOperation(int n, int start){
        int[] nums = defineNums(n, start);
        int result = nums[0];

        for (int i = 1; i < nums.length; i++){
            result = result ^ nums[i];
        } return result;
    }

    private static int[] defineNums(int n, int start){
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++){
            nums[i] = start + (2 * i);
        } return nums;
    }
}
