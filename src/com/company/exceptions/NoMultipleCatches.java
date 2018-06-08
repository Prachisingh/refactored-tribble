package com.company.exceptions;

/**
 * Created by prasingh on 22/5/18.
 */
public class NoMultipleCatches {
	public static void main(String[] args) {
		int i=12;
		int j=0;
		try {
			System.out.println(i/j);
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}
}
