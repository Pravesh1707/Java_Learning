package Arrays_Ex;
import java.util.*;
public class Com_fac {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Integer a");
		int a= s.nextInt();
		System.out.println("Enter the Integer b");
		int b= s.nextInt();
		int n; 
		int count=0;
		for(int i=1;i<=a & i<=b;i++) {
//			int r1=a%i;
//			int r2=b%i;
			if(a%i==0 && b%i==0) {
				count+=1;
			}
		}System.out.println(count);
	}

}
