package math.easy;

// https://leetcode.com/problems/count-the-digits-that-divide-a-number/
public class CountDigits {
    public static void main(String[] args){
        int num = 7;
        System.out.println(countDigits(num));
    }

    private static int countDigits(int num){
        int result = 0;
        int aux = num;
        while (aux > 0){
            int digit = aux % 10;
            if (digit != 0 && num % digit == 0) result += 1;
            aux = aux / 10;
        } return result;
    }
}
