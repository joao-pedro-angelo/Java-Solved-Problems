package arrays.easy;

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class VariablesString {
    public static void main(String[] args){
        String[] variables = new String[] {"--x", "x++", "x++"};
        System.out.println(variablesString(variables));
    }

    private static int variablesString(String[] array){
        int result = 0;
        for (String variable : array){
            if (variable.equalsIgnoreCase("--x")) result -= 1;
            else if (variable.equalsIgnoreCase("x++")) result += 1;
        } return result;
    }
}
