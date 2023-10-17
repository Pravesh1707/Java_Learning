package Arrays_Ex;
import java.util.*;

public class Arr_Sum {
	public static int [] Input(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int n=s.nextInt();
		System.out.println("Enter the Array :");
		int Input []= new int[n];
		for(int i=0;i<n;i++) {
			Input[i]=s.nextInt();
		}
		return Input;
	}
	public static int Arr_Sum(int Input[]) {
		int sum= 0;
		for (int i=0;i<Input.length;i++) {
			sum=sum+Input[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr []=Input();
		int Sum_of_Array=Arr_Sum(Arr);
		System.out.println("Sum of Array is : "+Sum_of_Array);
	}
}
