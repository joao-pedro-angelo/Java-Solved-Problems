package dynamicProgram.easy;

// https://leetcode.com/problems/divisor-game/description/
public class DivisorGame {
    public static void main(String[] args){
        System.out.println(divisorGame(2));
        System.out.println(divisorGame(4));
        System.out.println(divisorGame(15));
    }

    private static boolean divisorGame(int n){
        return (n % 2 == 0);
    }
}
