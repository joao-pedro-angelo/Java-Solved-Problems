package math.easy;

// https://leetcode.com/problems/sum-multiples/description/
public class Multiples {
    public static void main(String[] args){
        int number = 7;
        System.out.println(sumMultiples(number));
    }

    private static int sumMultiples(int number){
        int result = 0;
        for (int i = 1; i <= number; i++){
            if ( (i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)) result += i;
        } return result;
    }
}
