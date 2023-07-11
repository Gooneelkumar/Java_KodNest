package TimeConverter;

public class TimeConverter 
{
	public static void main(String[] args) 
	{
		double minutes;
		minutes = convertToHours(90);
		System.out.printf("%.1f",minutes);
		
	}
	
	public static double convertToHours(int minutes)
	{
		double hours;
		hours = (double) minutes/60;
		return hours;
		
	}
}
