package dynamicProgram.easy;

// https://leetcode.com/tag/dynamic-programming/
public class FibonacciNumber {
    public static void main(String[] args){
        // 1 1 2 3 5 8 13 21
        System.out.println(fibonacciRecursive(7));
        System.out.println(fibonacci(7));
    }

    private static int fibonacciRecursive(int number){
        if (number == 0) return 0;
        else if (number == 1) return 1;
        else if (number == 2) return 1;
        else return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }

    private static int fibonacci(int number){
        if (number > 1){
            int prev = 0;
            int current = 1;
            for (int i = 1; i < number; i++){
                int temp = current;
                current = prev + current;
                prev = temp;
            } return current;
        } return 1;
    }
}
