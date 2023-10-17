package Arrays_Ex;

public class leetCode1876 {
    public static void main(String[] args) {
        int ans = countGoodSubstrings("xyzzaz");
        System.out.println(ans);
    }
    public static int countGoodSubstrings(String s) {
        int count=0;
        int i=0;
        while(i < s.length()-2){
            int j=0;
            boolean arr[] = new boolean[26];
            while(j < 3){
                int ind = (int)(s.charAt(i+j))-97;
                if(j<3 && arr[ind]==true){
                    break;
                }
                else{
                    arr[ind]=true;
                    j++;
                }
            }
            if(j==3){
                count+=1;
            }
            i++;
        }
        return count;
    }
}
