package Vjudge;

import java.util.Arrays;
import java.util.Scanner;

class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextInt();
        for(long test=0;test<t;test++){
            int n = sc.nextInt();
            long k = sc.nextLong();

            long [] A = new long[n];
            long [] B = new long[n];

            for(int i = 0;i< n;i++){
                A[i] = sc.nextInt();
            }
            for(int i = 0;i< n;i++){
                B[i] = sc.nextInt();
            }
            long ans[] = new long[n*n];
            int l=0;
            for(int i = 0;i< n;i++){
                for(int j = 0;j< n;j++){
                    ans[l++] = A[i]+B[j];
                }
            }
            Arrays.sort(ans);
            for(int i = ans.length-1;i>ans.length-k-1;i--){
                System.out.print(ans[i]+" ");
            } 
            System.out.println();
        }
    }
}
