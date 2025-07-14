package com.baekjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_11022 {
	
	/*
	 * 문제 11022
	 * 
	 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	 * 
	 */
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int cnt = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 0;
		
		for( int i=1; i<= cnt; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #" + i +": " + a + " + " + b +" = " + ( a+b ) + "\n");
		}
		        
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");
		bw.flush();
		bw.close();
	}
}
