package com.baekjoon.step01;

import java.util.Scanner;

public class Baekjoon_2588 {
	
	/*
	 * 문제 2588
	 * 
	 * 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 
	 * 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		int fst = a * (b%10);
		int snd = a * ((b/10) % 10);
		int thd = a * (b/100);
		
		
		System.out.println( fst );
		System.out.println( snd );
		System.out.println( thd );
		System.out.println( fst + (snd*10) + (thd*100) );
		
		
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}
}
