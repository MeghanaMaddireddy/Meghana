package com.mphasis.com;

public class EvenOdd {
	public void check(int n) {
		if (n%2==0) {
			System.out.println("Even Number...");
		} else {
			System.out.println("Odd Number...");
		}
	}
	public static void main(String[] args) {
		EvenOdd e1=new EvenOdd();
		e1.check(7);
	}
}
