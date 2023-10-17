import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter no of Row :");
		int n=s.nextInt();
		int i=1;
		while (i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}System.out.println();
			i++;
		}
	}

}
