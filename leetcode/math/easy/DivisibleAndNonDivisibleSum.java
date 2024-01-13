package math.easy;

//https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/
public class DivisibleAndNonDivisibleSum {
    public static void main(String[] args){
        int n = 5;
        int m = 6;
        System.out.println(calculate(n, m));
    }

    private static int calculate(int n, int m){
        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= n; i++){
            if (i % m == 0) num1 += i;
            else num2 += i;
        }

        return (num1 - num2);
    }
}
