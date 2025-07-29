package com.programmers.lv1;

import java.util.Scanner;

public class Programmers_basic_1 {
	
	/*
	 * 조건에 맞게 수열 변환하기 1
	 * 
	 * 정수 배열 arr가 주어집니다. 
	 * arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 
	 * 50보다 작은 홀수라면 2를 곱합니다. 
	 * 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 100, 99, 98};
		int[] res = solution(arr);
	}
	
	// 문제
	public static int[] solution(int[] arr) {
        int[] answer = {};
        
        return answer;
    }
	
	// 내 풀이
	public static int[] mySolution(int[] arr) {
        int[] answer = new int[arr.length]; // 받은 배열과 동일한 사이즈로 배열 사이즈 지정
        
        for(int i=0; i<arr.length; i++){// 배열순서대로 갑 저장
        	
            if(arr[i] >= 50 && arr[i]%2 == 0){ // 짝수 그리고 50이상 조건
                answer[i] = arr[i]/2;
            } else if(arr[i] < 50 && arr[i]%2 == 1 ){ // 홀수 그리고 50미만 조건
                answer[i] = arr[i] * 2;
            }else {
            	answer[i] = arr[i]; // 나머지 그대로 리턴
            }
        }
        
        return answer;
    }
	
	// 다른 사람 풀이 -> 받은 값 그대로 리턴 하면서 조건식만 계산해서 넘겨 줌 => 조건문 덜 써도 됨
	public int[] otherSolution(int[] arr) {

        for(int i=0; i<arr.length; i++){
        	
            if(arr[i] >= 50 && arr[i] % 2 == 0){
                arr[i] = arr[i]/2;
            }else if(arr[i] < 50 && arr[i] % 2 == 1){
                arr[i] = arr[i]*2;
            }
            
        }
        
        return arr;
    }
}
