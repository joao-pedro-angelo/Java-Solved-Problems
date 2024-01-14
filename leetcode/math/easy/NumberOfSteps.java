package math.easy;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class NumberOfSteps {
    public static void main(String[] args){
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    private static int numberOfSteps(int num){
        int steps = 0;
        while (num > 0){
            if (num % 2 == 0) num = num / 2;
            else num = num - 1;
            steps += 1;
        } return steps;
    }
}
