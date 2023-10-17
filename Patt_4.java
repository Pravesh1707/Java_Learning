import java.util.Scanner;
public class Patt_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter th Pattern");
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int val=1;
			while(j<=i) {
				System.out.print(i);
				// use i ,n-j+1, new var and increment
				j=j+1;
			}
			System.out.println();
			i=i+1;
		} 
	}

}
