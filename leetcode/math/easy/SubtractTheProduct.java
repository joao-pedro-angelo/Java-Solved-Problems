package math.easy;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class SubtractTheProduct {
    public static void main(String[] args){
        int n = 234;
        System.out.println(subtractTheProduct(n));
    }

    private static int subtractTheProduct(int n){
       int product = calculateProduct(n);
       int sum = calculateSum(n);

       return (product - sum);
    }

    private static int calculateProduct(int n){
        int result = 1;
        String numberInString = String.valueOf(n);

        for (int i = 0; i < numberInString.length(); i++){
            result *= Integer.parseInt(String.valueOf(numberInString.charAt(i)));
        }

        return result;
    }

    private static int calculateSum(int n){
        int result = 0;
        String numberInString = String.valueOf(n);

        for (int i = 0; i < numberInString.length(); i++){
            result += Integer.parseInt(String.valueOf(numberInString.charAt(i)));
        }

        return result;
    }
}
