package Accenture;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + isPrime(num));

    }
    public static String isPrime(int a){

        String ans = " is Prime";
        for(int i=2;i<a;i++){
            if(a%i==0){
                ans = " is Not Prime.";
                // System.out.println(ans);
                break;
            }
        }

        return ans;
    }
}
