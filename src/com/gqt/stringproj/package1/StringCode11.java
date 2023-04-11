package com.gqt.stringproj.package1;

import java.util.Scanner;

public class StringCode11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int spc_cnt=0;
		str = str.trim();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				spc_cnt++;
			}
		}
		int word_cnt = spc_cnt+1;
		System.out.println("Word Count: "+word_cnt);
	}

}
