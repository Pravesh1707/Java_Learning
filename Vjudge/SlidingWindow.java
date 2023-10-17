package Vjudge;

import java.util.*;

public class SlidingWindow {
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
            for(int j=0; j<arr.length-k+1;j++){
                int max =Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int l=j;l<j+k;l++){
                    max = Math.max(max,arr[l]);
                    min = Math.min(min,arr[l]);
                }
                System.out.println(min); 
                System.out.println(max); 
                
            }
        }
    }
}
