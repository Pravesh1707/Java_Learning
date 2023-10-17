package Character_Pattern;
import java.util.*;
public class pyPatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int r = sc.nextInt();
		int i = 0;
		while(i < n) {
			int space = n-i-1;
			for(int j = 0; j< space; j++) {
				System.out.print(" ");
			}
			for(int k =0 ;k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
			i++;
		}
		
	}

}
