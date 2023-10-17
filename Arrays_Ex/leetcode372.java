package Arrays_Ex;

public class leetcode372 {
    public static void main(String[] args) {
        int a = 2147483647;
        int [] b = {2,0,0};
        int ans = superPow(a, b);
        System.out.println(ans);
    }   
    public static int superPow(int a, int[] b) {
        if(a == 1){
            return 1;
        }
        if(b.length==1){
            return (int)Math.pow(a,b[0]);
        }
        int pow = b[0];
        for(int i=1;i<b.length;i++){
            pow = pow*10 + b[i];
        }
        // int ans = a%1337;
        return (int)Math.pow(a,pow);
    }
}
