package saturday;
import java.util.Scanner;

public class GalacticArithmetic {
	public static void main(String args[])
	{
		long num1, num2;
		
		Scanner in = new Scanner (System.in);

		 num1=in.nextLong();
		 num2=in.nextLong();
		
		long result;
		result=galacticAddition(num1, num2);
		System.out.println(result);
		in.close();
	}
	public static long galacticAddition(long num1, long num2)
	{
		return(num1+num2);
	}

}
