package com.baekjoon.step01;

import java.util.Scanner;

public class Baekjoon_11382 {
	
	/*
	 * 문제 11382
	 * 
	 * 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 
	 * 이제 A + B + C를 계산할 차례이다!
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		Scanner in = new Scanner(System.in);
		
		// 범위가 10^12 까지 이므로 Long 사용
		Long a = in.nextLong();
		Long b = in.nextLong();
		Long c = in.nextLong();
		
		
		System.out.println( a+b+c );		
		
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}
}
