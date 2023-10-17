package Arrays_Ex;

public class main {
	 public static void change(int input[]){
			input = new int[5];
			input[0] = 15;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
        change(arr);
        System.out.println(arr[0]);

	}

}
