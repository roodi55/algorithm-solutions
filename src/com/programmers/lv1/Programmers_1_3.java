package com.programmers.lv1;

import java.util.Scanner;

public class Programmers_1_3 {
	
	/*
	 * [PCCE 기출문제] 3번 / 수 나누기
	 * 
	 * 2자리 이상의 정수 number가 주어집니다. 
	 * 주어진 코드는 이 수를 2자리씩 자른 뒤, 
	 * 자른 수를 모두 더해서 그 합을 출력하는 코드입니다. 
	 * 코드가 올바르게 작동하도록 한 줄을 수정해 주세요.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
	    int answer = 0;
	    
	    //1.기존 문제
	    for(int i=0; i< 1; i++){
	    	answer += number % 100;
	        number /= 100;
	    }
	    
	    //2.내 풀이 -> 몫이 존재하지 않을때까지 더하면 된다 생각하고 풀이
	    while(number>0) {
	    	answer += number % 100;
	        number /= 100;
	    }
	    
	    //3. 또 다른 방식 -> 본인과 비슷
	    while (number != 0){
	    	answer += number % 100;
	        number /= 100;
	    }
	     
	   //4. 또 다른 방식
	    for(int i=0; i< number; i++){
	    	answer += number % 100;
	        number /= 100;
	    }

	    System.out.println(answer);
	 }
}
