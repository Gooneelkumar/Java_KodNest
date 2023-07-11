package Main;

import java.util.Scanner;

public class TheDoubleThrouble {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int num,dn;
		num=in.nextInt();
		dn=doubleTheNumber(num);
		System.out.println(dn);
		
	}
	
	public static int doubleTheNumber(int num)
	{
		int dn;
		dn= num*2;
		return dn;
	}
	
}
