package Vjudge;

import java.util.Scanner;

public class WindowMax {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<arr.length;j++){
                arr[j] = sc.nextInt();
            }
            int sum=0;
            
            for(int j=0; j<arr.length-k+1;j++){
                int max =0;
                for(int l=j;l<j+k;l++){
                    max = Math.max(max,arr[l]);
                }
                sum += max;
            }
            System.out.println(sum); 

        }
    }
}
