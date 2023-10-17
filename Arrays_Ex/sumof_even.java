package Arrays_Ex;

public class sumof_even {
	    
	    public static int calculateSumOfEvenNumbers(int[] numbers){
	        //Implement your code here and change the return value accordingly
	        int sum=0;
	        for(int i=0;i<numbers.length;i++){
	           if(numbers[i]%2==0){
	            sum=sum+numbers[i];
	           }
	        }
	        return sum;
	    }
	    
		public static void main(String[] args) {
			int[] num = {68,79,86,99,23,2,41,100};
			System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(num));
		}
	}

