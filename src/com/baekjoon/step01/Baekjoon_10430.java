package com.baekjoon.step01;

import java.util.Scanner;

public class Baekjoon_10430 {
	
	/*
	 * 문제 10430
	 * 
	 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
	 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
	 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		System.out.println( ( a + b ) % c );
		System.out.println( (( a % c ) + ( b % c )) % c );
		System.out.println( ( a * b ) % c );
		System.out.println( (( a % c ) * ( b % c ) ) % c );
		
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}
}
