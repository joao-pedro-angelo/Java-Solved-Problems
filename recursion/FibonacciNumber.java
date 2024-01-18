public class FibonacciNumber {
    public static void main(String[] args){
        // 1 1 2 3 5 8 13
        System.out.println(fibonacci(3));
    }

    private static int fibonacci(int number){
        if (number <= 2) return 1;
        else return fibonacci(number - 2) + fibonacci(number - 1);
    }
}
