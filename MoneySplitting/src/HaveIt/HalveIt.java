package HaveIt;

public class HalveIt 
{
	public static void main(String[] args) 
	{
		double half;
		
		half= halveTheNumber(150.00);
		System.out.printf("%.2f",half);
	}
	
	public static double halveTheNumber(double num)
	{
	  double half;
	  half = num/2;
	  return half ;
	}

}
