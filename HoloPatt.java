import java.util.Scanner;

public class HoloPatt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i=0;i<r;i++){
             
            if(i ==0 || i == r-1){
                for(int j=0;j<c;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j=0;j<c;j++){
                    if(j==0 || j == c-1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
