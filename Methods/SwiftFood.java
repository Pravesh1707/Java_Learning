package Methods;

public class SwiftFood {
	String resturentName;
	String resturentAddres;
	long resturentContact;
	float Rating;
	
	public void displayResturentDetails() {
		System.out.println("Restaurent Details");
		System.out.println("******************");
		System.out.println("Restaurent Name : "+resturentName);
		System.out.println("Restaurent Rating : "+Rating);
		System.out.println("Restaurent Contact : "+resturentContact);
		System.out.println("Restaurent Address : "+resturentAddres);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwiftFood sf= new SwiftFood();
		sf.resturentName= "KFC";
		sf.resturentAddres="Noida DLF";
		sf.Rating=4.3f;
		sf.resturentContact=8130997345l;
		sf.displayResturentDetails();
		
	}

}
