package com.baekjoon.step01;

public class Baekjoon_10171 {
	
	/*
	 * 문제 10171
	 * 
	 * 고양이를 출력한다.
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
				
		System.out.println( "\\    /\\" );
		System.out.println( " )  ( ')" );	
		System.out.println( "(  /  )" );	
		System.out.println( " \\(__)|" );	
		
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}
}
