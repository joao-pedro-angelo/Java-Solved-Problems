package arrays.easy;

public class LargestElement {
    public static void main(String[] args){
        System.out.println(largestElement(new int[] {0, 1, 2, 3, 3}));
    }

    private static int largestElement(int[] array){
        int result = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > result) result = array[i];
        } return result;
    }
}
