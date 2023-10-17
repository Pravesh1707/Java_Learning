package Strings;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int a = lengthOfLongestSubstring(s);
        System.out.println(a);

    }
    public static int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            boolean charr[] = new boolean[27];
            int j=i;
            int count=0;
            while((j<=s.length()-1) && (charr[s.charAt(j)-97] != true )){
                int idx = s.charAt(j)-97;
                charr[idx] = true;
                j++;
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
