public class SumOfArray {
    public static void main(String[] args){
        System.out.println(sumOfArray(new int[] {1, 3, 5, 7, 9}));
    }

    private static int sumOfArray(int[] array){
        return sumOfArray(array, 0, array.length - 1);
    }

    private static int sumOfArray(int[] array, int left, int right){
        int result = 0;
        if (left <= right){
            result += array[left];
            result += sumOfArray(array, left + 1, right);
        } return result;
    }
}
