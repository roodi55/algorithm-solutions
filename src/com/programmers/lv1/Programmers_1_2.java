package com.programmers.lv1;

import java.util.Scanner;

public class Programmers_1_2 {
	
	/*
	 * [PCCE 기출문제] 2번 / 각도 합치기
	 * 
	 * 일반적으로 두 선분이 이루는 각도는 한 바퀴를 360도로 하여 표현합니다. 
	 * 따라서 각도에 360의 배수를 더하거나 빼더라도 같은 각을 의미합니다. 
	 * 예를 들면, 30도와 390도는 같은 각도입니다.
	 * 주어진 코드는 각도를 나타내는 두 정수 angle1과 angle2가 주어질 때,
	 * 이 두 각의 합을 0도 이상 360도 미만으로 출력하는 코드입니다. 
	 * 코드가 올바르게 작동하도록 한 줄을 수정해 주세요.
	 * 
	 * 디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
	 * 1줄만 수정하여 버그를 고치세요.
	 * 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.
	 * 
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        // 배수만큼 제거하여 풀이
        System.out.println(sum_angle - (sum_angle/360)*360);
        
        // 나머지만 구하는 방식이 있음
        //int sum_angle = (angle1 + angle2)%360;
    }
}
