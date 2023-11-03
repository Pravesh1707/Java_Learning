package Accenture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ={2,3,1,4,5};
        int cost = 7;
        int ans = max_candies(arr,cost);
        System.out.println(ans);
    }
    public static int max_candies(int arr[], int i){
        int max=0;
        Arrays.sort(arr);
        for(int j : arr){
            if(i>j){
                max++;
                i-=j;
            }
        }
        return max;
    }
}
