package Arithmetoc;

public class ArithmeticOperation {
	public static void main(String[] args) 
	{
		int answer=subtractNumbers(20, 5);
		System.out.println(answer);

		 answer= multiplyNumbers(4, 5);
		 System.out.println(answer);

			double ans;
		ans =divideNumbers(20, 4);
		System.out.printf("%f.2f",ans);


		answer =findRemainder(10, 3);
		System.out.println(answer);

	}
	
	public static int subtractNumbers(int num1, int num2)
	{
		int diff;
		diff = num1-num2;
		return(diff);
	}

	public static int multiplyNumbers(int num1, int num2)
	{
		int product;
		product=num1*num2;
		return(product);
	}
	public static double divideNumbers(int num1, int num2)
	{
		double quotient;
		quotient = num1/num2;
		return(quotient);
	}
	

	public static int findRemainder(int num1, int num2)
	{
	  int rem;
	  rem = num1 %num2;
	  return rem;
	}

}
