package math.easy;

public class SplitDigits{
    public static void main(String[] args){
        int num = 2932;
        System.out.println(splitDigits(num));
    }

    private static int splitDigits(int num){
        int[] array = new int[4];
        int aux = 0;

        while (num != 0){
            array[aux++] = num % 10;
            num = num / 10;
        }
        sortArray(array);

        return ((array[0] * 10 + array[3]) + (array[1] * 10 + array[2]));
    }

    private static void sortArray(int[] array){
        for (int i = array.length - 1; i > 0; i--){
            int j = i;
            while (j > 0 && array[j] <= array[j - 1]){
                int aux = array[j];
                array[j] = array[j-1];
                array[j-1] = aux;
                j -= 1;
            }
        }
    }
}