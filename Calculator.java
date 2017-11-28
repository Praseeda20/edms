package com.calc;

public class Calculator {
	public int add(int a, int b) {
		return (a + b);
	}

	public int sub(int a, int b) {
		return (a - b);
	}

	public int divide(int a, int b) throws IllegalArgumentException{
		if(b==0){
			throw new IllegalArgumentException("denominator should not be zero");
		}
		else{
			return (a/b);
		}
	}
}
