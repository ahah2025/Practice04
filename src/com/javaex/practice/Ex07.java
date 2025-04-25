/*
   결	  과	 	 값
금액: 67879
50000원:1개
10000원:1개
5000원:1개
1000원:2개
500원:1개
100원:3개
50원:1개
10원:2개
5원:1개
1원:4개 
 */
package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] wonArray = new int[10];
		
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		System.out.println("금액: 67879");
		System.out.println(wonArray[0]+"원:1개");
		System.out.println(wonArray[1]+"원:1개" );
		System.out.println(wonArray[2]+"원:1개");
		System.out.println(wonArray[3]+"원:2개");
		System.out.println(wonArray[4]+"원:1개");
		System.out.println(wonArray[5]+"원:3개");
		System.out.println(wonArray[6]+"원:1개");
		System.out.println(wonArray[7]+"원:2개");
		System.out.println(wonArray[8]+"원:1개");
		System.out.println(wonArray[9]+"원:4개");
	}

}
