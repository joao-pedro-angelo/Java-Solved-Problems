public class ReverseDigitsOfNumber {
    public static void main(String[] args) {
        System.out.println(reverseDigits(89760));
    }

    public static String reverseDigits(int number){
        String numberString = "";
        if (number != 0){
            numberString += (number % 10);
            numberString += reverseDigits(number / 10);
        } return numberString;
    }
}
