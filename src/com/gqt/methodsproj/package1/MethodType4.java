package com.gqt.methodsproj.package1;

class Calculator4 {//no input but gives output
	int add(int a,int b) {
		int c=a+b;
		return c;
	}
}
public class MethodType4 {
	public static void main(String[] args) {
	Calculator4 c1 = new Calculator4();
	int res=c1.add(10,20);
	System.out.println("Output from main is :"+res);

	}

}
