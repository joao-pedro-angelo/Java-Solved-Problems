package math.easy;

//https://leetcode.com/problems/smallest-even-multiple/description/
public class SmallestEvenMultiple {
    public static void main(String[] args){
        int number01 = 5;
        int number02 = 6;
        System.out.println(smallestMultiple(number01));
        System.out.println(smallestMultiple(number02));
    }

    private static int smallestMultiple(int number){
        if (number % 2 == 0) return number;
        else return number * 2;
    }
}
