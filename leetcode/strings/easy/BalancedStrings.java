package strings.easy;

// https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
public class BalancedStrings {
    public static void main(String[] args){
        String input = "RLRRRLLRLL";
        System.out.println(balancedStrings(input));
    }

    private static int balancedStrings(String input){
        int result = 0;
        int numberOfR = 0;
        int numberOfL = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == 'R') numberOfR++;
            else if (input.charAt(i) == 'L') numberOfL++;

            if (numberOfL == numberOfR){
                result++;
                numberOfR = 0;
                numberOfL = 0;
            }
        } return result;
    }

}
