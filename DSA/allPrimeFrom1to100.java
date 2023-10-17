package DSA;

public class allPrimeFrom1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=3;i<=100;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}else {
					System.out.print(i);
				}
			}
		}
	}

}
