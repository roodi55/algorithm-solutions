package com.programmers.lv1;

import java.util.Scanner;

public class Programmers_1_20 {
	
	/**
	 * 문자열 돌리기
	 * 
	 * 코드 작성
	 * 
	 * 문자열 str이 주어집니다.
	 * 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
	 * 
	 * 입력 abcde
	 * 출력 a
	 *	   b
	 *	   c
	 *	   d
	 *	   e
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");
        
        for(String str : arr){
            System.out.println(str);
        }
    }
	
	// 다른 풀이
	public static void otherSolution(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
        for (char ch : a.toCharArray()){ //문자열(String)을 문자 배열(char[])로 변환하는 메서드 훨씬 간단
            System.out.println(ch);
    	}
    }
		
}
