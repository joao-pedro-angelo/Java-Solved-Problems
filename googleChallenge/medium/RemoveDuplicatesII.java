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

    public static int removeDuplicates(int[] arr){
        return 0;
    }
}
