package DSA;
import java.util.Arrays;

public class kthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,10, 4 ,3 ,20, 15};
		int n=arr.length;
		int k=3;
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
	}

}
