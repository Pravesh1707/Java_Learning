package Vjudge;

import java.util.Scanner;

public class Bit_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = sc.nextInt();

        System.out.println((a | (1 << k)));
    }
}
