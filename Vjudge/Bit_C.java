package Vjudge;

public class Bit_C {
    public static void main(String[] args) {
        int n[] = {1,2,3,4,5,6,7,8,10,11};
        int ans = n[0];
        int x2=1;
        for(int i=1;i<n.length;i++){
            ans = ans ^ n[i];
        }
        for (int i = 2; i <= n.length+1; i++)
            x2 = x2 ^ i;
        System.out.println(ans^x2);
    }
}
