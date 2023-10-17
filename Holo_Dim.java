import java.util.Scanner;

public class Holo_Dim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int r =0; r<n;r++){

                for(int c =0; c< n-r-1;c++){
                    System.out.print(" ");
                }
    
                for(int c =0; c< 2*r+1;c++){
                    if(c ==0 || c == 2*r){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }

        for(int r =0; r<n;r++){
            
            for(int c =0; c<r ;c++){
                System.out.print(" ");
            }

            for(int c =0; c<2*n-2*r-1;c++){
                if(c ==0 || c == 2*n-2*r-2){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
