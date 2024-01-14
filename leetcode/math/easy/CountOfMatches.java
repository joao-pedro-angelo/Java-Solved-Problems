package math.easy;

// https://leetcode.com/problems/count-of-matches-in-tournament/description/
public class CountOfMatches {
    public static void main(String[] args){
        int numTeams = 14;
        System.out.println(countOfMatches(numTeams));
    }

    private static int countOfMatches(int numTeams){
        int result = 0;
        while (numTeams >= 2){
            if (numTeams % 2 == 0) result += numTeams / 2;
            else result += (numTeams / 2) + 1;
            numTeams /= 2;
        } return result;
    }
}
