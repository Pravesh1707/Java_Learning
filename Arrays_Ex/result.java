package Arrays_Ex;

public class result {
	int[] marks;
	result(int marks[]){
		this.marks=marks;
	}
	public static void finalGrade(int marks[]) {
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>=92)
				System.out.print("E ");
			else if(marks[i]>=85 & marks[i]<92)
				System.out.print("A ");
			else if(marks[i]>=70 & marks[i]<85)
				System.out.print("B ");
			else if(marks[i]>=65 & marks[i]<70)
				System.out.print("C ");
			else 
				System.out.print("D ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {79,87,97,65,78,99,66};
		System.out.println("Greads corresponging to the marks are : ");
		result.finalGrade(arr);

	}

}
