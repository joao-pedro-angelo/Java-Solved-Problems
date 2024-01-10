package strings.easy;

// https://leetcode.com/problems/jewels-and-stones/description/
public class JewelsAndStones {
    public static void main(String[] args){
        String jewels = "aA";
        String stones = "aAAbbbbB";
        System.out.println(jewelsAndStones(jewels, stones));
    }

    private static int jewelsAndStones(String jewels, String stones){
        int result = 0;
        for (int i = 0; i < jewels.length(); i++){
            for (int j = 0; j < stones.length(); j++){
                if (jewels.charAt(i) == stones.charAt(j)) result++;
            }
        } return result;
    }
}
