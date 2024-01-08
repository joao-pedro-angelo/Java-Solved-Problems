import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        int factorial = calculateFactorial(number);
        System.out.println(factorial);
    }

    private static int calculateFactorial(int number){
        int result = 1;
        while (number > 0){
            result = result * number;
            number = number - 1;
        } return result;
    }
}
