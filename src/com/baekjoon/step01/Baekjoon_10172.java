package com.baekjoon.step01;

public class Baekjoon_10172 {
	
	/*
	 * 문제 10172
	 * 
	 * 아래 예제와 같이 개를 출력하시오.
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
				
		System.out.println( "|\\_/|" );
		System.out.println( "|q p|   /}" );	
		System.out.println( "( 0 )\"\"\"\\" );	
		System.out.println( "|\"^\"`    |" );
		System.out.println( "||_/=\\\\__|" );
		
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}
}
