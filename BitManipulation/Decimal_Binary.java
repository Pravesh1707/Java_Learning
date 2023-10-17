package BitManipulation;

import java.util.Scanner;

public class Decimal_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = Integer.toBinaryString(n);
        System.out.print(ans);
    }
}
