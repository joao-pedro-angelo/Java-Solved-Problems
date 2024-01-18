public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }

    private static boolean isPrime(int number){
        return isPrime(number, 2);
    }

    private static boolean isPrime(int number, int divisor){
        if (number == 1) return false;

        if (divisor == number) return true;
        else if (number % divisor == 0) return false;
        else return isPrime(number, divisor + 1);
    }
}
