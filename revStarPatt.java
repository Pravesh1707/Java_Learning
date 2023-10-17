import java.util.Scanner;

public class revStarPatt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n) {
			int j=1;
//			int space=n-i;
			while(j<=n-i+1) {
				System.out.print("*");
				j++;
			}
//			j=1;
//			while(j<=i) {
//				System.out.print('*');
//				j++;
//			}
			System.out.println(); 
			i++;
		}
	}

}
