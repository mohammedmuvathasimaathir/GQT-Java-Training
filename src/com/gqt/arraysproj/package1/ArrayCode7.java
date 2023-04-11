package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class ArrayCode7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
/*   University(i)     Colleges(j)       Classroom(k)           Students(l)
         RV                0                 0                       5
                                             1                       5
                                             2                       5
                                             3                       5
                           1                 0                       5
                                             1                       5
                                             2                       5
                                             3                       5
                           2                 0                       5
                                             1                       5
                                             2                       5
                                             3                       5
           VR              0                 0                       6
                                             1                       6
                                             2                       6
                           1                 0                       6
                                             1                       6
                                             2                       6      
 */
		System.out.println("Enter the number of university: ");
		int uni = sc.nextInt();
		int arr[][][][] = new int[uni][][][];
		
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the count of college: "+(i+1));
			arr[i] = new int[sc.nextInt()][][];
		}
		
		for(int i=0;i<arr.length;i++) {
		System.out.println("inside college: "+(i+1));
		for(int j=0;j<arr[i].length;j++) {
		System.out.println("Enter the count of class: "+(j+1));
			arr[i][j] = new int[sc.nextInt()][];
		}
		}
		
		for(int i=0;i<arr.length;i++) {
		System.out.println("inside college: "+(i+1));
		for(int j=0;j<arr[i].length;j++) {
		System.out.println("inside class: "+(j+1));
		for(int k=0;j<arr[i][j].length;k++) {
		System.out.println("Enter the count of students in a class: "+(k+1));
		arr[i][j][k] = new int[sc.nextInt()];
		}
		}
		}
		
		for(int i=0;i<arr.length;i++) {
		System.out.println("Inside university :"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
		System.out.println("Inside school :"+(j+1));
		for(int k=0;k<arr[i][j].length;k++) {
		System.out.println("Inside class :"+(k+1));
		for(int l=0;l<arr[i][j][k].length;l++) {
		System.out.println("Enter the marks of student no:"+(l+1));
		arr[i][j][k][l] = sc.nextInt();
	    }
		}
		}
		}
		
		for(int i=0;i<arr.length;i++) {
		System.out.println("Inside university :"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
		System.out.println("Inside school :"+(j+1));
		for(int k=0;k<arr[i][j].length;k++) {
		System.out.println("Inside class :"+(k+1));
		for(int l=0;l<arr[i][j][k].length;l++) {
		System.out.println("Enter the marks of student no:"+(l+1)+" is : "+arr[i][j][k][l] );
		}

      }

	}

	}

}
}
