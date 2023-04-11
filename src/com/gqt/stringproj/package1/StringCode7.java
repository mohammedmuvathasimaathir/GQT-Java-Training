package com.gqt.stringproj.package1;

public class StringCode7 {

	public static void main(String[] args) {
		String s1 = "Mohammed";
		String s2 = "Aathir";
//		s1.concat(s2);//immutable
		s1 = s1.concat(s2);//Forcable Mutation
			System.out.println(s1);
		}

	}

