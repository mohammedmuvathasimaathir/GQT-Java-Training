package com.gqt.stringproj.package1;

import java.util.Scanner;

public class StringCode14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		String str2 = "";
		for(int i =str.length()-1;i>0;i--) {
			str2=str2+str.charAt(i);
		}
		if(str.equals(str2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a Palindrome");
		}

	}

}
