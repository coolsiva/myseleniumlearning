package com.exp.in;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sample
 {
	 public static void main (String args[]) {
		
		 String s = "WHERE are you come from 123";
		 Pattern p = Pattern.compile(".*");
		 Matcher m = p.matcher(s);
		 System.out.println(m.find());
		 System.out.println(m.matches());
		 boolean x = true;
		 if(x)
		 {
			 System.out.println(x);
		 }
		 
		
	 }
 }