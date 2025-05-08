//주어진 배열에서 3의 배수의 개수=>6
//주어진 배열에서 3의 배수의 합=>108
package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] date = {1,3,5, 8,9,11,15, 19,18,20,30,33,31};
		
		int count =0;
		int sum = 0;
		
		//배열의 처음부터 끝까지 순회
		for(int i=0; i<date.length; i++) {
			
			//현재 배열의 값이 3의 배수인지 검사
			if((date[i]%3)==0) {
				count++;
				sum += date[i];
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + count);
		System.out.println("주어진 배열에서 3의 배수의 합=>" + sum);
	}

}
