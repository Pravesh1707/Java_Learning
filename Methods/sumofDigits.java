package Methods;

public class sumofDigits {
	
	public void sun(int num) {
		int sum=0;
		while(num>0) {
			//num=num/10;
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
		//return sum;
	}//return sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sumofDigits obj= new sumofDigits();
		int a=123;
		obj.sun(a);

	}

}
