package Arrays_Ex;
import java.util.ArrayList;

public class removeDulpicat {
	public ArrayList removdup(ArrayList <Integer> arr){
		ArrayList<Integer> temp=new ArrayList<>();
		for(int i:arr) {
			if(!temp.contains(i)) {
				temp.add(i);
			}
		}return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		System.out.println("Before Removing");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("After Removing");
		removeDulpicat obj=new removeDulpicat();
		ArrayList <Integer> temp=obj.removdup(arr);
		System.out.print(temp);
	}

}
