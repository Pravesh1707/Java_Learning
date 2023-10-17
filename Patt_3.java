import java.util.Scanner;
public class Patt_3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the No of Row :");
		int n = s.nextInt();
		int i=1;
		int val=1;
		while(i<=n){
			int Space =1;
			while(Space<=n-i) {
				System.out.print(" ");
				Space = Space +1;
			}
			int j=1;
			while(j<=i) {
				System.out.print(val);
				val = val+1;
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}
