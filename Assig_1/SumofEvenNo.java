package Assig_1;

public class SumofEvenNo {
	public static int SumofEven(int a[]) {
		int sum=0;
		int len=a.length;
		for (int i=0;i<len;i++) {
			if(a[i]%2==0) {
				sum+=a[i];
			}
		}return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		//SumofEvenNo obj=new SumofEvenNo();
		int sum=SumofEven(arr);
		System.out.println(sum);
	}

}
