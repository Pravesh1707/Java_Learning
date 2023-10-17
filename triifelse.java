import java.util.*;
public class triifelse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Side :");
		int a =sc.nextInt();
		System.out.println("Enter Secound Side :");
		int b=sc.nextInt();
		System.out.println("Enter Third Side :");
		int c = sc.nextInt();
		if((a + b > c) && (b + c > a) && (c + a > b)){
			System.out.println("Triangle can be formed");
		}else {
			System.out.println("Triangle cannot be formed");
		}
	}

}

