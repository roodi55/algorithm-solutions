package com.baekjoon.step04;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Baekjoon_10807 {
	
	/*
	 * 문제 10807
	 * 
	 * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
	 * 
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int cnt = Integer.parseInt(br.readLine()); // 첫 줄: 개수
        StringTokenizer st = new StringTokenizer(br.readLine()); // 두 번째 줄: 정수들
        
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            numberList.add(Integer.parseInt(st.nextToken()));
        }
        
        int targetValue = Integer.parseInt(br.readLine());
        
        int occurrences = Collections.frequency(numberList, targetValue); // 특정값 등장횟수 카운트 - 표준 라이브러리로 신뢰성 및 간결성
        bw.write(String.valueOf(occurrences));
        
        bw.flush();
        br.close();
        bw.close();
		
	}
	
	/**
	 * 코드 개선
	 * 
	 * 요점
	 * 1. 확장성 고려 HashMap사용 입력과 동시에 카운팅+조회 
	 * 2. Collections.frequency() 제거 -> 검색시 시간복잡도 O(1)
	 * 3. getOrDefault() 사용 -> null 체크 없이 안전한 값 추출
	 * 
	 */
	public static void refactoring(String[] args) {
		try (
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
			int count = Integer.parseInt(br.readLine()); // 입력 개수
			String[] tokens = br.readLine().trim().split("\\s+"); // 숫자 리스트
			
			if (tokens.length != count) {
			    throw new IllegalArgumentException("입력된 숫자의 개수가 일치하지 않습니다.");
			}
			
			int target = Integer.parseInt(br.readLine()); // 타겟 숫자
			
			Map<Integer, Integer> freqMap = new HashMap<>();
			
			for(String token : tokens) {
				int num = Integer.parseInt(token);
				freqMap.put(num, freqMap.getOrDefault(num, 0) + 1); // 키가 없다면 기본값 0 반환 1 증가
			}
			
			int result = freqMap.getOrDefault(target, 0);
			
			bw.write(String.valueOf(result)); 
			bw.flush();
			
			br.close();
			bw.close();
			
		} catch ( IOException e ) {
			
			System.err.println("입출력 오류 " + e.getMessage());
			
		}
	}
}
