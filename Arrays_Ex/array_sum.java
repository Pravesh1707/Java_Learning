package Arrays_Ex;
import java.util.*;
public class array_sum {
	public static int[]input(){
		Scanner s= new Scanner(System.in);
	    System.out.println("Enter length of array");
		int l=s.nextInt();
		int []arr=new int [l];
		for(int i=0;i<l;i++) {
			arr[i]=s.nextInt();
		}return arr;
	}
	public static int[] sum(int[]a,int [] b) {
		int[]sum=new int[a.length];
		for(int i=0;i<a.length;i++) {
			sum[i]=a[i]+b[i];
		}
		System.out.println("Addition of 2 Array is : ");
		for(int i=0;i<sum.length;i++) {
			System.out.print(sum[i]+" ");
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s= new Scanner(System.in);
		//System.out.println("Enter length of array");
		//int l=s.nextInt();
		//int [] a1=input();
		//int [] a2=input();
		//int []add_of_2arr=sum(a1,a2);
  		String name = "ABCD";
  				System.out.println(name);
		}

}
