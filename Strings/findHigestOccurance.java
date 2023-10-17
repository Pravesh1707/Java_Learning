package Strings;

public class findHigestOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="success";
		int hig=0;
		int count=1;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			count=1;
			for(int j=1;j<str.length();j++) {
				if(ch==str.charAt(j)) {
					count++;
				}
				
			
			}if(hig<count) {
				hig=count;
			}
		}
		System.out.println(hig);
	}

}
