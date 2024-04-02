package medium;


//leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description
public class RemoveDuplicatesII {

    public static void main(String[] args){
        int[] arr = new int[] {0, 0, 0, 1, 1, 1, 2, 2, 3};
        int n = removeDuplicates(arr);
        for (int i = 0; i <= n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int prev = 0, count = 1;
        for (int current = 1; current < nums.length; current++) {
            if (nums[prev] == nums[current]) {
                if (count < 2) {
                    count++;
                    nums[++prev] = nums[current];
                }
            } else {
                count = 1;
                nums[++prev] = nums[current];
            }
        }
        return prev;
    }
}
