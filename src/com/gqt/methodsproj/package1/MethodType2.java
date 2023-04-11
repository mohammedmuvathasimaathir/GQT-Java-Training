package com.gqt.methodsproj.package1;

class Calculator2 {//with input and no output
	void add(int a,int b) {

		int c=a+b;
		System.out.println(c);
	}
}
public class MethodType2 {
	public static void main(String[] args) {
	Calculator2 c1 = new Calculator2();
	c1.add(10,20);

	}

}
