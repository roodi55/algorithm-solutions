package com.baekjoon.step03;

import java.util.Scanner;

public class Baekjoon_8393 {
	
	/*
	 * 문제 8393
	 * 
	 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int sum = 0;
		
		for( int i = 1; i <= a; i++) {
			sum = sum+i;
		}
		
		System.out.println( sum );
		
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}
}
