import java.util.Scanner;

public class selfpatt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		int i=1;
//		char val='A';
		while(i<=n) {
			int j=1;
			char val=(char)('A'+i-1);
			while(j<=n) {
				
				System.out.print(val);
				val+=1;
				j++;
				
			}
			
			System.out.println();
			i++;
			val++;
		}
	}

}
