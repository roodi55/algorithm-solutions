package com.baekjoon.step03;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Baekjoon_10951 {
	
	/*
	 * 문제 10951
	 * 
	 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 코드 시작 시간
		
		Scanner in = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		while(in.hasNextInt()) {
			a = in.nextInt();
			b = in.nextInt();

			System.out.println(a+b);			
		}
		
		in.close();	
		
		long endTime = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTime - startTime;
	    
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec");

	}
	
	// 코드 개선
	 private static void update10951(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner보다 대량의 입력 처리 가능
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        String line;
	        
	        while ((line = br.readLine()) != null && !line.trim().isEmpty()) { // br.readLine() 한줄씩 입력받고 그 값이 없을시 종료
	            String[] inputs = line.split(" "); // split(" ")사용 공백 기준 두 정수 받기 
	            int a = Integer.parseInt(inputs[0]); // 공백 기준 1번째 정수
	            int b = Integer.parseInt(inputs[1]); // 공백 기준 2번째 정수

	            bw.write((a + b) + "\n");
	        }

	        br.close();
	        bw.close();
	    }
}
