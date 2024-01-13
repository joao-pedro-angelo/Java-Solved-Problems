package math.easy;

// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/description/
public class SplitDigits {
    public static void main(String[] args){
        int n = 2932;
        System.out.println(splitDigits(n));
    }

    private static int splitDigits(int n){
        int minimumDigitIndex = searchIndexMinimumDigit(n);
        int secondMinimumDigitIndex = searchIndexSecondMinimumDigit(n, minimumDigitIndex);

        return secondMinimumDigitIndex;
    }

    private static int searchIndexMinimumDigit(int n){
        String valueString = String.valueOf(n);
        int minimum = Integer.MAX_VALUE;
        int index = -1;

        for(int i = 0; i < valueString.length(); i++){
            int aux = Integer.parseInt(String.valueOf(valueString.charAt(i)));
            if (aux <= minimum){
                index = i;
                minimum = aux;
            }
        }
        return index;
    }

    private static int searchIndexSecondMinimumDigit(int n, int indexMinimum){
        String valueString = String.valueOf(n);
        int minimum = Integer.MAX_VALUE;
        int index = -1;

        for(int i = 0; i < valueString.length(); i++){
            int aux = Integer.parseInt(String.valueOf(valueString.charAt(i)));
            if ((aux <= minimum) && (i != indexMinimum)){
                index = i;
                minimum = aux;
            }
        }
        return index;
    }

}
