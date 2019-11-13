package test;

import java.util.*; 

public class testing {
	  public static void main(String[] args) {
		  String s = reverse("word");
		  System.out.println(s);
	  }
	  // bigo = On
	  static String reverse(String s) {
		   if(s.length() == 0)
		     return "";
		   return s.charAt(s.length() - 1) + reverse(s.substring(0,s.length()-1));
		 }
	}