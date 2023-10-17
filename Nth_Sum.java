import java.util.*;
public class Nth_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th Nth Number:");
		int n = sc.nextInt();
		int Sum =0;
		for (int i=1;i<=n;i++){
				Sum = Sum + i;
			}
		System.out.println("Sum of Nth Numbers :"+Sum);
	}
}
