package easy;

public class removeDuplicatesSortedArray {

    public static void main(String[] args){
        int[] arr = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5};
        int n = removeDuplicates(arr);
        for (int i = 0; i <= n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums){
        int k = 0;
        int actual = 1;
        int next = actual + 1;

        while (actual < nums.length && next < nums.length){
            if (nums[actual] <= nums[actual - 1]){
                nums[actual] = nums[next];
                next++;
            } else{
                actual++;
                next = actual + 1;
                k++;
            }
        }

        if (nums[nums.length - 1] > nums[k]){
            nums[++k] = nums[nums.length - 1];
        }

        return k;
    }

}
