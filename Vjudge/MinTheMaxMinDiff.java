package Vjudge;

import java.util.Arrays;
import java.util.Scanner;

public class MinTheMaxMinDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int a = arr[n-1]-arr[1];
        int b = arr[n-2]-arr[0];
        System.out.println(Math.min(a,b));
    }
}
