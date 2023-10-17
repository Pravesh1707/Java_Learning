package DSA;

public class maxAndMinOfArr {
	
	public static void main(String args[]) {
		int arr[]= {-1,-2,0,10,5,4};
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Max is : "+max);
		System.out.println("Min is : "+min);
	}

}
