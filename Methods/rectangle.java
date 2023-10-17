package Methods;

public class rectangle {
	public static double calculareArea(float len, float width) {
		double area;
		area =len*width;
		return area;
	}
	public static double calculatePeri(float len, float width) {
		double peri;
		peri= 2*(len+width);
		return peri;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rectangle obj= new rectangle();
		float l=12f;
		float w=5f;
		//obj.calculareArea(l, w);
		double per=calculareArea(l, w);
		System.out.println(per);
	}

}
