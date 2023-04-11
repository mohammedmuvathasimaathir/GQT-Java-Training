package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class JaggedCode2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number of schools: ");
		int sch = sc.nextInt();
		
		int arr[][][] = new int[sch][][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of class: "+(i+1));
			arr[i] = new int[sc.nextInt()][];
		}
		
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the number of schools: "+(i+1));
		for(int j=0;j<arr[i].length;j++) {
		System.out.println("Enter the count of students in a class: "+(j+1));
			arr[i][j] = new int[sc.nextInt()];
		}
		}
		
		for(int i=0;i<arr.length;i++) {
		System.out.println("Inside school :"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
		System.out.println("Inside class :"+(j+1));
		for(int k=0;k<arr[i][j].length;k++) {
		System.out.println("Enter the marks of student no:"+(k+1));
		arr[i][j][k] = sc.nextInt();
	}
		}
		}
		
		for(int i=0;i<arr.length;i++) {
		System.out.println("Inside school :"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
		System.out.println("Inside class :"+(j+1));
		for(int k=0;k<arr[i][j].length;k++) {
		System.out.println("Enter the marks of student no:"+(k+1)+" is : "+arr[i][j][k] );
		}

      }

	}

}
}
