package oops;
interface hello{
	public void print();
}

public class Hi {
	
	public void print() {
		System.out.println("Hello method inside Hi Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi obj = new Hi();
		obj.print();
	}

}
