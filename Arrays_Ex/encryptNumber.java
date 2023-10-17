package Arrays_Ex;

import java.util.Scanner;

public class encryptNumber {
	public String eny(int a) {
		String s=Integer.toString(a);
		int arr[]=new int[s.length()-1];
		for(int i=s.length();i>=0;i--) {
			int rem=a%10;
			arr[i]=rem;
			a=a/10;
		}
		int i=0;
		while(i<arr.length-1) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			i+=2;
		}
		String s1="";
		for(int j=0;j<arr.length;j++) {
			s1+=arr[i];
		}
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		encryptNumber obj=new encryptNumber();
		System.out.println(obj.eny(a));
	}

}
