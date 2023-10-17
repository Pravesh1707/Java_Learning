package oops;

public class JavaException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data = 100/0;
			
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("");
	}

}
