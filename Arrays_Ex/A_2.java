package Arrays_Ex;
import java.util.*;

public class A_2 {
	public static int largest(int Inp[]) {
		int m=Integer.MIN_VALUE;
		for(int i=0;i<Inp.length;i++) {
			if(Inp[i]>m) {
				m=Inp[i];
			}
		}
		
		return m;
	}
	public static int []Inp() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Size of Array ");
		int size= s.nextInt();
		System.out.println("Enter the Array ");
		int Inp []=new int[size];
		for(int i=0;i<size;i++) {
			Inp [i] =s.nextInt();
		}
		return Inp;
		
		
	}
	public static void increment(int Inp[]) {
		for(int i=0;i<Inp.length;i++) {
			Inp[i]++;
		}
		
	}
	public static void Display(int Inp[]) {
		System.out.println("Array is ");
		for(int i=0;i<Inp.length;i++) {
			System.out.print(Inp[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		increment(arr);
		Display(arr);
//		Display(arr);
		int lar=largest(arr);
		System.out.println("largest  in array is "+lar);
	}

}
