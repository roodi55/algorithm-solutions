package com.baekjoon.step03;

import java.util.Scanner;

public class Baekjoon_2739 {
	
	/*
	 * 문제 2739
	 * 
	 * N을 입력받은 뒤, 
	 * 구구단 N단을 출력하는 프로그램을 작성하시오. 
	 * 출력 형식에 맞춰서 출력하면 된다.
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		for( int i = 1; i < 10; i++) {
			System.out.println( a +" * "+ i +" = "+ ( a * i ) );
		}

		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}
}
