import java.util.Scanner;

public class Num_patt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        int i=0;
        while(i < r){
            int j=0;
            int val = 1;
            while(j<=i){
                System.out.print(val+" ");
                val++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
