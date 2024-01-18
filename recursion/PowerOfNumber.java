public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(pot(2, 3));
    }

    private static int pot(int number, int elev){
        if (elev == 0) return 1;
        else if (elev == 1) return number;
        else return (number * pot(number, elev - 1));
    }
}
