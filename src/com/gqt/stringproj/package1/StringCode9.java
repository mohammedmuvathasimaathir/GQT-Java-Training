package com.gqt.stringproj.package1;

import java.util.Scanner;

public class StringCode9 { //Vowels or consonants

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		str = str.toLowerCase();
		int vowel_cnt = 0;
		int cons_cnt = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
			   str.charAt(i)=='o' || str.charAt(i)=='u') {
			vowel_cnt ++;
		}
		else {
			cons_cnt++;
		}
	}
	System.out.println("Vowel count is :"+vowel_cnt);
	System.out.println("Consonant count is :"+cons_cnt);
}
}
