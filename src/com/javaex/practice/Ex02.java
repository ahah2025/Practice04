package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		double[] doubleArr = new double[3];
		
		doubleArr[0]=6.7;
		doubleArr[1]=3.3;
		doubleArr[2]=1.2;
		
		for(int i=doubleArr.length-1; i>=0; i--) {
			System.out.println(doubleArr[i]);
		}

	}

}
