public class SumDigits {
    public static void main(String[] args){
        System.out.println(sumOfDigits(81));
    }

    private static int sumOfDigits(int number){
        int result = 0;
        if (number != 0){
            result = (number % 10) + sumOfDigits(number / 10);
        } return result;
    }
}
