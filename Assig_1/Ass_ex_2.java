package Assig_1;
import java.util.*;

public class Ass_ex_2 {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("Enter the Number :");
		int a= S.nextInt();
		int r=0;
		
		int dig;
		while(a>0) {
			dig=a%10;
			r=r*10 + dig;
			a=a/10;
		}
		System.out.println("Reverse of Number is : "+r);
	}

}
