package marks;

public class Student {
	
	public static void main(String[] args) {
		

		
		
		StudentObj s1 =new StudentObj(85,79,91,76,88,95,80,85);
		  s1.avg= calculateAverage(85, 79, 91, 76, 88, 95, 80, 85);

		  System.out.printf("%.2f",s1.avg);
	}
	public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8)
	{
		double avg;
		avg= (double)(sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
		return avg;
	}

}
