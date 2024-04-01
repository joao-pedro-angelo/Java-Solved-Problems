package easy;

import java.util.Arrays;

//leetcode.com/problems/remove-element/description
public class RemoveElement {

    public static void main(String[] args){
        int[] nums = new int[] {0, 1, 2, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeElement(nums, val));
        System.out.println("---");
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val){
        int indexAux = nums.length - 1;
        int k = 0;
        while (indexAux >= 0){
            if (nums[indexAux] == val){
                int j = indexAux;
                while (j < nums.length - 1){
                    int aux = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = aux;
                    j++;
                }
            } else{
                k++;
            }
            indexAux--;
        }
        return k;
    }

}
