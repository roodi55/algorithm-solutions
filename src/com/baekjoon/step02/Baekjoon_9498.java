package com.baekjoon.step02;

import java.util.Scanner;

public class Baekjoon_9498 {
	
	/*
	 * 문제 9498
	 * 
	 * 시험 점수를 입력받아 90 ~ 100점은 A, 
	 * 80 ~ 89점은 B, 
	 * 70 ~ 79점은 C, 
	 * 60 ~ 69점은 D, 
	 * 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		if(a >= 90 && a <= 100) {
			System.out.println("A");
		}else if(a >= 80 && a <= 89) {
			System.out.println("B");
		}else if(a >= 70 && a <= 79) {
			System.out.println("C");
		}else if(a >= 60 && a <= 69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}
}
