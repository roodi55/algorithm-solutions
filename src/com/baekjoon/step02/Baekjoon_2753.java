package com.baekjoon.step02;

import java.util.Scanner;

public class Baekjoon_2753 {
	
	/*
	 * 문제 2753
	 * 
	 * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
	 * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
	 * 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
	 * 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
	 * 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		if( a % 4 == 0) {
			if( a % 100 != 0 || a % 400 == 0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}else {
			System.out.println("0");
		}
		
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}
}
