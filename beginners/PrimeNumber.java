import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        boolean isPrime = verifyPrime(number);
        System.out.println(isPrime);
    }

    private static boolean verifyPrime(int number){
        for (int i = 2; i <= (number / 2); i++){
            if (number % i == 0) return false;
        } return true;
    }
}
