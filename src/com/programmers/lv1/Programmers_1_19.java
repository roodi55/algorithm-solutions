package com.programmers.lv1;

import java.util.Scanner;

public class Programmers_1_19 {
	
	/**
	 * 덧셈식 출력하기
	 * 
	 * 코드 작성
	 * 
	 * 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
	 * 출력 a + b = c
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println( a + " + " + b + " = " + (a + b)); // System.out.printf("%d + %d = %d",a,b,a+b); 이게 더 간단함
    }
		
}
