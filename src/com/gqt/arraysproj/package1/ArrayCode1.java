package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class ArrayCode1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of student no:"+(i+1));
		    arr[i] = sc.nextInt();
	}
		
		System.out.println("####----Marks added----####");
		
		for(int i=0;i<n;i++) {
			System.out.println("The marks of students no:"+(i+1)+" is = " +arr[i]);
		}
		}

	}


