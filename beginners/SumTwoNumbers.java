import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number01 = Integer.parseInt(sc.nextLine());
        int number02 = Integer.parseInt(sc.nextLine());

        System.out.println(number01 + number02);
    }
}
