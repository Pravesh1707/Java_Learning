package Arrays_Ex;
import java.util.*;

public class Swap_alt {
	public static int []Input(){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Size :");
		int size= s.nextInt();
		System.out.println("Enter "+size+"numbers : ");
		int Input []= new int[size];
		for (int i =0;i<size;i++) {
			Input[i]=s.nextInt();
			
		}
		return Input;
	}
	public static void swapAlt(int Input[]) {
		int i=0;
		int t;
		while (i<Input.length -1){
			t=Input[i];
			Input[i]=Input[i+1];
			Input[i+1]=t;
			i=i+2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=Input();
		int i=0;
		int t;
		while (i<arr.length -1){
			t=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=t;
			i=i+2;
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
