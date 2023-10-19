import java.util.*;

// Carelon 2024 Test
public class hashMap {
	public static void main(String[] args) {

	String  arr[] = {"hello","Good"};
	int len = arr.length;
	// char maxChar = 0;

	
	int i=0;
	while(len-->0){
		HashMap<Character, Integer> hm = new HashMap<>();
		
			String str =  arr[i];
			for(char a :str.toCharArray())
			if (hm.containsKey(a)) {
				int val = hm.get(a);
				hm.put(a, val + 1);
			} else {
				hm.put(a, 1);
			}

		char maxChar = ' ';
		int max = Integer.MIN_VALUE;
		for (char a: hm.keySet()) {
			if (hm.get(a) > max) {
				max = hm.get(a);
				maxChar = a;
			}
		}
		i++;
		System.out.println(maxChar);
	}
	// System.out.println();
	}
}