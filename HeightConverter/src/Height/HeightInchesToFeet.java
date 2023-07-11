package Height;

public class HeightInchesToFeet {
	public static void main(String[] args) {
		
		HeightConverter converter = new HeightConverter();

		double height= converter.convertInchesToFeet(72.0);
		System.out.printf("%.2f",height);
	}

}
