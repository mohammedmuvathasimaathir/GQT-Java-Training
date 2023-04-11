package com.gqt.methodsproj.package1;

class Calculator3 {//no input but gives output
	int add() {
		int a = 10;
		int b=20;
		int c=a+b;
		return c;
	}
}
public class MethodType3 {
	public static void main(String[] args) {
	Calculator3 c1 = new Calculator3();
	int res=c1.add();
	System.out.println("Output from main is :"+res);

	}

}
