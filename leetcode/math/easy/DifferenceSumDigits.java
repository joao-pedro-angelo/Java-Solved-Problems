package math.easy;

// https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/
public class DifferenceSumDigits {
    public static void main(String[] args){
        int[] nums = {1, 15, 6, 3};
        System.out.println(differenceOfSum(nums));
    }

    private static int differenceOfSum(int[] nums){
        int sumElements = sumElements(nums);
        int sumDigits = sumDigits(nums);

        return (sumElements - sumDigits);
    }

    private static int sumElements(int[] nums){
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return result;
    }

    private static int sumDigits(int[] nums){
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            while (nums[i] > 0){
                int aux = nums[i];
                result += aux % 10;
                nums[i] = nums[i] / 10;
            }
        } return result;
    }
}
