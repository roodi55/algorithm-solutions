package com.baekjoon.step02;

import java.util.Scanner;

public class Baekjoon_2525 {
	
	/*
	 * 문제 2525
	 * 
	 * KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 
	 * 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 
	 * 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
	 * 또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
	 * 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 
	 * 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		int take = in.nextInt();
		
		// if문 안에서만 사용 but 메모리 할당/해제 오버헤드 줄이기 위에 밖에 선언
		int takeH = (m+take)/60;
		int takeM = (m+take)%60;
		
		if( m + take < 60) {
			System.out.println(h +" " + (m+take));
		}else {
			
			if( (h+takeH) > 23 ) {
				System.out.println( (h+takeH)-24 +" "+ takeM );
			}else {
				System.out.println( (h+takeH) +" "+ takeM );
			}
			
		}
		
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
	}
}
