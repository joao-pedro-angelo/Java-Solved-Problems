package strings.easy;

// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/
public class MaximumNumberOfWords {
    public static void main(String[] args){
        String[] strings = new String[] {"alice and bob love leetcode", "i think so too",
                "this is great thanks very much"};
        System.out.println(maximumWords(strings));
    }

    private static int maximumWords(String[] strings){
        int max = 0;
        for (int i = 0; i < strings.length; i++){
            int length = 0;
            for (int j = 0; j < strings[i].length(); j++){
                if (strings[i].charAt(j) == ' ') length++;
            } if (length > 0) length ++;
            if (length > max) max = length;
        } return max;
    }
}
