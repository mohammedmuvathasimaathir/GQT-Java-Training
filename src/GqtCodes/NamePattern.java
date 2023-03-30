package GqtCodes;

import java.util.Scanner;

public class NamePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the value");
		int n = sc.nextInt();
		
		for(int i=0;i<=n-1;i++) {
			//loic A
			for(int j=0;j<=n-1;j++) {
				if(j==0 || j==n/2 
					|| (i==n/2 && j<=n/2)
					|| (i==0 && j<=n/2))
			 {
					System.out.print("# ");
			}
			else {
				System.out.print("  ");
			}
			}
			
			//logic A
			for(int j=0;j<=n-1;j++) {
				if(j==0 || j==n/2 
					|| (i==n/2 && j<=n/2)
					|| (i==0 && j<=n/2))
			 {
					System.out.print("# ");
			}
			else {
				System.out.print("  ");
			}
			}
			
			//logic T
			for(int j=0;j<=n-1;j++) {
				if(i==0 && j<=n/2 || j==n/4)
			 {
					System.out.print("# ");
			}
			else {
				System.out.print("  ");
			}
			}
			
			// logic H
			for(int j=0;j<=n-1;j++) {
				if(j==0 || j==n/2
				   || (i==n/2 && j<=n/2))
			 {
					System.out.print("# ");
			}
			else {
				System.out.print("  ");
			}
			}
			// logic I
			for(int j=0;j<=n-1;j++) {
				if((i==0 && j<=n/2)
				  || (i==(n-1) && j<=n/2)
				  || j==n/4)
			 {
					System.out.print("# ");
			}
			else {
				System.out.print("  ");
			}
			}
			
			//logic R
			for(int j=0;j<=n-1;j++) {
				if(j==0 ||
				  (i==0 && j<n/2) ||
				  (i==n/2 && j<n/2) ||
				  (i-j == n/2 && j<=n/2) ||
				  (j==n/2 && i!=0 && i<n/2))
			 {
					System.out.print("# ");
			}
			else {
				System.out.print("  ");
			}
			}
			System.out.println();
			
        }
	}
}