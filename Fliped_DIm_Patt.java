import java.util.Scanner;

public class Fliped_DIm_Patt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int r=0;r<n;r++){
            
            for(int col=0;col<n-r;col++){
                System.out.print("*");
            }
            for(int s=0;s<=2*r;s++){
                System.out.print(" ");
            }
            for(int col=0;col<n-r;col++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int r=0;r<n;r++){
            
            for(int col=0;col<=r;col++){
                System.out.print("*");
            }
            for(int s=0;s<=2*n-2*r-2;s++){
                System.out.print(" ");
            }
            for(int col=0;col<=r;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
