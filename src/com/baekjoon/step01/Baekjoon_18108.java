package com.baekjoon.step01;

import java.util.Scanner;

public class Baekjoon_18108 {
	
	/*
	 * 문제 18108
	 * 
	 * ICPC Bangkok Regional에 참가하기 위해 
	 * 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다. 
	 * 공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.
	 * 불교 국가인 태국은 불멸기원(佛滅紀元), 
	 * 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다. 
	 * 반면, 우리나라는 서기 연도를 사용하고 있다. 
	 * 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		System.out.println(a-543);
		
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}

}
