package strings.easy;

import java.util.Arrays;

// Adapted from leetcode
public class FindWordsWithCharacteres {
    public static void main(String[] args){
        String[] words = new String[] {"leet", "code"};
        char charactere = 'e';
        System.out.println(Arrays.toString(findWords(words, charactere)));
    }

    private static int[] findWords(String[] words, char charactere){
        boolean[] flags = calculateLength(words, charactere);
        int[] result = new int[words.length];
        for (int i = 0; i < flags.length; i++){
            if (flags[i]) result[i] = 1;
        } return result;
    }

    private static boolean[] calculateLength(String[] words, char charactere){
        boolean[] result = new boolean[words.length];
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words[i].length(); j++){
                if (words[i].charAt(j) == charactere) {
                    result[i] = true;
                    break;
                }
            }
        } return result;
    }
}
