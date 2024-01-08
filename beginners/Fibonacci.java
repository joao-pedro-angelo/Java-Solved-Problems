import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        System.out.println(calculateFibonacci(N));
    }

    private static int calculateFibonacci(int N){
        return calculateFibonacci(N, 0, 1);
    }

    private static int calculateFibonacci(int N, int prev, int current){
        if (N > 1){
            for (int i = 2; i <= N; i++){
                int temp = current;
                current = prev + current;
                prev = temp;
            } return current;
        } return 1;
    }
}
