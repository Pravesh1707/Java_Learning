package Strings;
import java.util.*;
public class pelendrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="radar";
		int len=st.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev+=st.charAt(i);
		}
		boolean res=rev.equals(st);
		System.out.println(res);
		//pelendrom.tocheckpelendrom(st);
		//System.out.println(result);
		
	}

}
