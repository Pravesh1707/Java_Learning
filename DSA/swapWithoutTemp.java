package DSA;

public class swapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=4;
		System.out.println("Before swap :" +"a is : "+a + " and b is : " +b );
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap :" +"a is : "+a + " and b is : " +b );
		
	}

}
