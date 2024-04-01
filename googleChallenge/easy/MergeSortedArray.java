package easy;

import java.util.Arrays;

//leetcode.com/problems/merge-sorted-array/description
public class MergeSortedArray {

    public static void main(String[] args){
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0, 0, 0, 0};
        int[] nums2 = new int[] {1, 1, 2, 4, 4, 5};
        int m = 3;
        int n = 6;
        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int indexNums2 = 0;
        int indexNums1 = m-1;
        int position = m;

        while (indexNums2 < n){
            nums1[position] = nums2[indexNums2];
            if (nums2[indexNums2] < nums1[indexNums1]){
                nums1[position--] = nums1[indexNums1];
                nums1[indexNums1--] = nums2[indexNums2];
            } else{
                indexNums2++;
                indexNums1 = ((m-1) + indexNums2);
                position = m + indexNums2;
            }
        }

    }

    public static int[] mergeWithNewArray(int[] nums1, int[] nums2){
        int[] result = new int[nums1.length + nums2.length];
        int m = 0;
        int n = 0;
        int position = 0;

        while (m < nums1.length && n < nums2.length){
            if (nums1[m] < nums2[n]){
                result[position] = nums1[m];
                m++;
            } else {
                result[position] = nums2[n];
                n++;
            } position++;
        }

        while (m < nums1.length){
            result[position] = nums1[m];
            position++;
            m++;
        } while (n < nums2.length){
            result[position] = nums2[n];
            position++;
            n++;
        }

        return result;
    }
}
