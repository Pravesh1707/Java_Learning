package Arrays_Ex;

import java.util.Scanner;

public class sup100Q {
	public String number(int a) {
		String b[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		return b[a];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sup100Q obj=new sup100Q();
		System.out.println(obj.number(a));
	}

}
