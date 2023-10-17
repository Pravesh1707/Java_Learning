package Arrays_Ex;
import java.util.*;

public class Arra_i_d {
	public static int []Input_arr(){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size= s.nextInt();
		System.out.println("Enter element in Array");
		int Inp []= new int[size];
		for (int i=0;i<size;i++) {
			Inp[i]=s.nextInt();
		}
		return Inp;
	}
	public static void Display(int Inp[]) {
		for(int i=0;i<Inp.length;i++) {
			System.out.print(Inp[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		int A[]= Input_arr();
		Display(A);
	}

}
