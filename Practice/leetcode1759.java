package Practice;

public class leetcode1759 {
        public static void main(String[] args) {
            String s="abbcccaa";
            int ans= countHomogenous(s);
            System.out.println(ans);
        }

        public static int countHomogenous(String s) {
            int ans=0;
            int MOD = (int) 1e9 + 7;
            int i=0;
            while(i < s.length()){
                int j=i+1;
                int count=1;
                while(j<s.length() && s.charAt(i)==s.charAt(j)){
                    count++;
                    j++;
                }
               ans +=(count * (count+1))/2 % MOD ;
               i=j;
            }
            return ans;
        }
}
