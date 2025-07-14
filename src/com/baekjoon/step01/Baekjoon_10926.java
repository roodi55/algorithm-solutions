package com.baekjoon.step01;

import java.util.Scanner;

public class Baekjoon_10926 {
	
	/*
	 * 문제 10926
	 * 
	 * 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 
	 * 준하는 놀람을 ??!로 표현한다. 
	 * 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 
	 * 놀람을 표현하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		System.out.println(str+"??!");
		
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}
}
