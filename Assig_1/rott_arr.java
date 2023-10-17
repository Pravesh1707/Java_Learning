package Assig_1;
import java.util.*;

public class rott_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int temp=0;
		int n=s.nextInt();
		int[] a=new int[n];	
		while(true) {
			for(int i=0;i<n/2;i++) {
				for(int j=n;j<n/2;j--) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	}

}
