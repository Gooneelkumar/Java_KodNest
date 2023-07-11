package JourneyCalculator;

public class JC {
 public static void main(String[] args) {

		JourneyCalculator journeyCalculator = new JourneyCalculator();
		
		double d = journeyCalculator.calculateDistance(60.0, 1.5);
		//System.out.println(d);
		System.out.printf("%.2f",d);
}	
}


