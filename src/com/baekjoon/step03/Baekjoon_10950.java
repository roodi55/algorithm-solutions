package com.baekjoon.step03;

import java.util.Scanner;

public class Baekjoon_10950 {
	
	/*
	 * 문제 10950
	 * 
	 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();
		
		for( int i = 0; i < cnt; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.println( a + b );
		}

		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}
}
