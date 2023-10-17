package Character_Pattern;
import java.util.*;
public class Inter_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = "(The Truck hit the Bike)";
		int count=0;
		for (int i=0;i<a.length();i++) {
			if (a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' ) {
				count++;
			}
		}System.out.println(count);
	}
}
      


