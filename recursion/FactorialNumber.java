public class FactorialNumber {
    public static void main(String[] args){
        System.out.println(factorial(5));
    }

    private static int factorial(int number){
        if (number == 0) return 1;
        else return number * factorial(number - 1);
    }
}
