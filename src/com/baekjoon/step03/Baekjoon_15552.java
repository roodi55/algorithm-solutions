package com.baekjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_15552 {
	
	/*
	 * 문제 15552
	 * 
	 * 빠른 A+B
	 * 
	 */
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st; // 공백단위로 데이터 가공
		int cnt = Integer.parseInt(br.readLine()); // readLine > String으로 고정 따라서 형변환
		
		for(int i=0; i<cnt; i++) {
			st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		        
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		
		bw.flush();
        bw.close();
	}
}
