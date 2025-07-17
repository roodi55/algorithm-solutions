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

public class Baekjoon_10871 {
	
	/*
	 * 문제 10871
	 * 
	 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
	 * 
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] firstLine = br.readLine().split(" ");
        int cnt = Integer.parseInt(firstLine[0]);
        int target = Integer.parseInt(firstLine[1]);
        
        String[] numbers = br.readLine().split(" ");
        
        for (int i = 0; i < cnt; i++) {
        	int num = Integer.parseInt(numbers[i]);
            if (num < target) {
            	bw.write(num + " ");
            }
            
        }

        bw.flush();
        br.close();
        bw.close();
		
	}
	
	/**
	 * 코드 개선
	 * 
	 * 요점
	 * 1. StringBuilder 사용 반복 호출 제거 -> 출력 성능 향상
	 * 2. try-with-resources 사용 자원 자동 정리
	 * 
	 */
	public static void mainImprovedSolution(String[] args) throws IOException {
        // try-with-resources 구문으로 BufferedReader, BufferedWriter 자동 닫기 처리
        try (
        		
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
            		
        ) {
            // 첫 번째 줄 입력 받아서 공백 기준으로 분리 (N, target)
            String[] firstLine = br.readLine().split(" ");
            
            int cnt = Integer.parseInt(firstLine[0]);      // 정수 개수 N
            int target = Integer.parseInt(firstLine[1]);   // 기준 값 target

            // 두 번째 줄 입력 받아서 공백 기준으로 숫자 배열 생성
            String[] numbers = br.readLine().split(" ");

            // 입력 개수와 실제 입력된 숫자 개수가 맞는지 확인 (방어적 코딩)
            if (numbers.length != cnt) {
                throw new IllegalArgumentException("입력 수가 일치하지 않습니다.");
            }

            // 출력할 결과를 모아둘 StringBuilder 생성 (출력 효율 향상)
            StringBuilder sb = new StringBuilder();

            // 숫자 배열을 순회하며 target보다 작은 숫자만 StringBuilder에 추가
            for (int i = 0; i < cnt; i++) {
            	
                int num = Integer.parseInt(numbers[i]);
                
                if (num < target) {
                    sb.append(num).append(" ");
                }
                
            }

            // 모아둔 결과를 한 번에 출력
            bw.write(sb.toString());
            bw.flush();  // 버퍼에 남아있는 데이터 강제 출력
            br.close();
            bw.close();
        }
    }
}
