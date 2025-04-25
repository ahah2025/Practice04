//주어진 배열에서 3의 배수의 합=>203
package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] scores = {1,3,5, 8,9,11,15, 19,18,20,30,33,31};
		
		int sum = 0;
		for(int score:scores) {
			sum=sum+score;
		}
		//System.out.println("주어진 배열에서 3의 배수의 개수=>" + avg);
		
		int avg= (int) sum / scores.length;
		System.out.println("주어진 배열에서 3의 배수의 합=>" +sum);
		//작성 위치
		//System.out.println("주어진 배열에서 3의 배수의 개수=>" + sum);
		//System.out.println("주어진 배열에서 3의 배수의 합=>" +(d+sum));

	}

}
