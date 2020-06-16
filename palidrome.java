package com.exp.in;

import java.util.Scanner;

public class palidrome {

	public static void main (String ars[])
	{
		StringBuilder res ;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string value");
		String str=s.nextLine();
		System.out.println("enter 2 the value");
		String output=s.nextLine();
		StringBuilder build = new StringBuilder();
		build.append(str);
		res = build.reverse();
		/*
		 * for(int i=str.length()-1;i>=0;i--) {
		 * 
		 * res = res + str.charAt(i); }
		 */
		if(res.toString().equals(output))
		{System.out.println("palindrome");
		
		}else
		{
			System.out.println("not palidrome"); //Ram Siva
		}
		
		
	}
}
