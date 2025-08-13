package com.programmers.lv1;

public class Programmers_1_24 {
	
	/**
	 * 문자열 리스트를 문자열로 변환하기
	 * 
	 * 코드 작성
	 * 
	 * 문자들이 담겨있는 배열 arr가 주어집니다. 
	 * arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
        String[] arr = {"a","b","c"};
        
        solution(arr);
    }
	
	
	public static String solution(String[] arr) {
        String answer = "";
        
        for(String a : arr){
            answer += a;
        }
        
        return answer;
    }

	// 다른 풀이
	public String otherSolution(String[] arr) {
		return String.join("", arr); // 배열의 요소들을 빈 문자열("")로 연결
	}
}
