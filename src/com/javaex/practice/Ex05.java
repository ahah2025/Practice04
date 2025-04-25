/*
10
20
30
40
50
0
평균은 30 입니다.
 */
package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] intArr;
		intArr = new int[6];

		intArr[0]=10;
		intArr[1]=20;
		intArr[2]=30;
		intArr[3]=40;
		intArr[4]=50;
				
		for(int i=0; i<6; i++) {
			System.out.println(intArr[i]);
		}
		
		System.out.println("평균은 "+ (intArr[2]) + " 입니다.");		

	}

}
