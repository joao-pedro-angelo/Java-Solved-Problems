package math.easy;

// https://leetcode.com/problems/add-two-integers/description/
public class AddTwoIntegers {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = -10;
        System.out.println(sumNumber(number1, number2));
    }

    private static int sumNumber(int number1, int number2){
        return (number1 + number2);
    }
}
