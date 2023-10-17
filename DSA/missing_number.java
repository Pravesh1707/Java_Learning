package DSA;

import java.util.*;


public class missing_number {
	public static void main(String [] args) {
		Set< Integer > miss = new HashSet< Integer >();
		miss.add(0);
		miss.add(1);
		miss.add(2);
		miss.add(4);
		miss.add(5);
		miss.add(6);
		for (int i = 0; i < miss.size(); i++) {
			if(! miss.contains(i)) {
				System.out.println(i);
			}
		}
	}
}
