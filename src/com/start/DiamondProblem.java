package com.start;

interface A {
	public default void method() {
		System.out.println("Method - A");
	}
}

interface B {
	public default void method() {
		System.out.println("Method - B");
	}
}

public class DiamondProblem implements A, B {

	@Override
	public void method() {
		A.super.method();
	}

	public static void main(String[] args) {
		DiamondProblem d = new DiamondProblem();
		d.method();
	}

}
