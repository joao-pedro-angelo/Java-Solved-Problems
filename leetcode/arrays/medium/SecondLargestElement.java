package arrays.medium;

public class SecondLargestElement {
    public static void main(String[] args){
        System.out.println(secondLargestElement(new int[] {10, 8, 5, 1, 7}));
    }

    private static int secondLargestElement(int[] array){
        int indexMaxValueInTheArray = largestElement(array);
        int secondLargest = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > secondLargest && i != indexMaxValueInTheArray) secondLargest = array[i];
        } return secondLargest;
    }

    private static int largestElement(int[] array){
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] >= array[maxIndex]) maxIndex = i;
        } if (maxIndex == 0){
            swap(array, 0, 1);
            maxIndex = 1;
        } return maxIndex;
    }

    private static void swap(int[] array, int i, int j){
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
