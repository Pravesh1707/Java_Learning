import java.util.*;
public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		if(A>0) {
			System.out.println(A+" is a Positive Number");
		}else if(A<0) {
			System.out.println(A+" is a Negative Number");
		}else {
			System.out.println(A+" is Equal to Zero");
		}

	}

}
