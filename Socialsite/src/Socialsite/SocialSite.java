package Socialsite;

import java.util.Scanner;

public class SocialSite {
	public static void main(String args[])
	{
		String str1,str2,s;
		Scanner in = new Scanner (System.in);
		
		str1= in.next();
		str2= in.next();
		
		s= joinStrings(str1, str2);
		System.out.println(s);
	}
	public static String joinStrings(String str1, String str2)
	{
		String s3;
		s3= str1 + str2;
		return(s3);
	}

}
