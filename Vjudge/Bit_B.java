package Vjudge;

import java.util.Scanner;

public class Bit_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(((n > 0) && (n & (n - 1)) == 0) ? "true" : "false");
        }

        sc.close();
    }
}
