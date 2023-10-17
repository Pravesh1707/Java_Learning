package Vjudge;

import java.util.Scanner;

public class Bit_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        
        System.out.println(((n>0)&&(n&(n-1))== 0) ? "true" : "false");
    }
}
