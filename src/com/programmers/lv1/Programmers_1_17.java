package com.programmers.lv1;

import java.util.Scanner;

public class Programmers_1_17 {
	
	/**
	 * 대소문자 바꿔서 출력하기
	 * 
	 * 코드 작성
	 * 
	 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
	 * 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
	 * 
	 * 입력 aBcDeFg
	 * 출력 AbCdEfG
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String a = sc.next();
	        
	    char[] ch = a.toCharArray();
	        
	    for(char c : ch){
	       if(Character.isUpperCase(c)){
	          c = Character.toLowerCase(c);
	        }else{
	          c = Character.toUpperCase(c);
	        }
	        System.out.print(c);
	    }
    }
	
	//다른 풀이 
	public static void otherSolution(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder(); // 내부에서 가변배열 사용 보다 더 빠르고 효율적

        for (char c : a.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        System.out.println(sb.toString());
    }
	
}
