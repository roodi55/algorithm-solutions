package com.programmers.lv1;

import java.util.Scanner;

public class Programmers_1_21 {
	
	/**
	 * 홀짝 구분하기
	 * 
	 * 코드 작성
	 * 
	 * 자연수 n이 입력으로 주어졌을 때 
	 * 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%2 == 0){
            System.out.print(n + " is even");
        } else {
            System.out.print(n + " is odd");
        }
    }
	
	// 다른 풀이
	public static void otherSolution(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd")); // 이리 간단하게 풀 수 있음,,,


    }
		
}
