import java.util.Scanner;

public class Rev_Num_Patt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        int i=0;
        while(i < r){
            int j=0;
            int val = 1;
            while(j<=r-i-1){
                System.out.print(val+" ");
                val++;
                j++;
            }
            System.out.println();
            i++;
        
        }
    }
}

