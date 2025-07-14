package com.baekjoon.step03;

import java.util.Scanner;

public class Baekjoon_25304 {
	
	/*
	 * 문제 25304
	 * 
	 * 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 
	 * 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 
	 * 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
	 * 영수증에 적힌, 구매한 각 물건의 가격과 개수
	 * 구매한 물건들의 총 금액을 보고, 
	 * 구매한 물건의 가격과 개수로 계산한 총 금액이 
	 * 영수증에 적힌 총 금액과 일치하는지 검사해보자.
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		int division = in.nextInt();
		int sum = 0;
		
		for( int i = 1; i <= division; i++) {
			int price = in.nextInt();
			int cnt = in.nextInt();
			
			sum = sum + ( price * cnt );
		}
		
		if( sum == total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
				
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}
}
