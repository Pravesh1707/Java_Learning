import java.util.Scanner;
public class Patt_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter th no of Rows :");
		int n= s.nextInt();
		int incc =1;
		int i=0;
		while(i<=n) {
			int j=0;
			while(j<=i) {
				System.out.print(incc+" ");
				incc =incc + 1;
				j=j+1;
			}System.out.println(" ");
			i=i+1;
		}
	}

}
