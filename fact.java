import java.util.*;
public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fact=1;
		System.out.println("Enter the Number :");
		int a =sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(a==0) {
				System.out.println("Factorial is 1");
			}else {
				fact= fact*i;
			}
		}System.out.println("Factorial of a is "+fact);
	}
}
