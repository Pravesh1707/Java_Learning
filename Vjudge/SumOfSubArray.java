package Vjudge;

import java.util.Scanner;

public class SumOfSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int preSum[] = new int[arr.length];
        preSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            preSum[i] = arr[i] + preSum[i - 1];

        }
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int st = sc.nextInt();
            int end = sc.nextInt();
            if (st == 0) {
                System.out.println(preSum[end]);
            } else {
                System.out.println(preSum[end] - preSum[st - 1]);
            }
        }

    }
}
