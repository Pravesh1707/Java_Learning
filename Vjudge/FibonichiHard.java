package Vjudge;

import java.util.Scanner;

public class FibonichiHard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a < 2){
                System.out.println(1);
            }
            else{
                
                int m = 1000000007;
                long dp [] = new long[a+1];
                dp[0] = 1;
                dp[1] = 1;
                for(int j=2;j<=a;j++){
                    dp[j] = dp[j-1]+dp[j-2];
                }
                System.out.println((dp[a]%m + m) % m);
            }
        }
    }
}
