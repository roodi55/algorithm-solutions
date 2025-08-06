package com.programmers.lv1;

import java.util.Scanner;

public class Programmers_1_10 {
	
	/*
	 * [PCCE 기출문제] 2번 / 피타고라스의 정리
	 * 
	 * 디버깅
	 * 
	 * 직각삼각형이 주어졌을 때 빗변의 제곱은 다른 두 변을 각각 제곱한 것의 합과 같습니다.
	 * 직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가 주어질 때, 
	 * 다른 한 변의 길이의 제곱, b_square 을 출력하도록 한 줄을 수정해 코드를 완성해 주세요.
	 */
	//기존 문제
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     int a = sc.nextInt();
	     int c = sc.nextInt();

	     int b_square = c - a;
	     // 수정 int b_square = c*c - a*a;
	     
	     // 다른 풀이
	     // 거듭제곱 사용 방식
//	     int b_square = (int) Math.pow(c, 2) - (int) Math.pow(a, 2);
	     
	     // 합차 방식 사용
//	     int b_square = (c - a) * (c + a);

	     System.out.println(b_square);
	 }
}
