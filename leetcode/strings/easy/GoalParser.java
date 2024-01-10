package strings.easy;

//https://leetcode.com/problems/goal-parser-interpretation/description/
public class GoalParser {
    public static void main(String[] args){
        String command = "G()(al)";
        System.out.println(goalParser(command));
    }

    private static String goalParser(String command){
        String result = "";
        for (int i = 0; i < command.length(); i++){
            if (command.charAt(i) == 'G') result += "G";
            else if (command.charAt(i) == '(' && i < command.length() - 1 && command.charAt(i + 1) == ')') result += "o";
            else if (command.charAt(i) == 'a') result += "al";
        } return result;
    }
}
