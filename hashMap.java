import java.util.*;

public class hashMap {
	public static void main(String[] args) {

	int arr[] = {2,4,2,3,3};
	int max = 0;
	int maxChar = 0;

	HashMap<Integer, Integer> hm = new HashMap<>();

		for (int a : arr) {
//			char a = arr[i];
			if (hm.containsKey(a)) {
				int val = hm.get(a);
				hm.put(a, val + 1);
			} else {
				hm.put(a, 1);
			}
		}

		for (int a: hm.keySet()) {
			if (hm.get(a) > max) {
				max = hm.get(a);
				maxChar = a;
			}
		}
		System.out.println("max is :  " + max);
		System.out.println("max char is :  " + maxChar);
	}
}