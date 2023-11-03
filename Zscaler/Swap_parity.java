public class Swap_parity {
    public static void main(String[] args) {
        String str = "7596801";
        String ans = swap(str);
        System.out.print(ans);
    }
    public static String swap(String a){
        String ans="";
        int i=1;
        while(i<a.length()){
            if(((int)a.charAt(i)%2==0 && (int)a.charAt(i+1)%2==0) || ((int)a.charAt(i)%2!=0 && (int)a.charAt(i+1)%2!=0)){
                ans += a.charAt(i+1)+a.charAt(i);
                i+=2;
            }
            else{
                
            }
        }
        return ans;
    }
}
