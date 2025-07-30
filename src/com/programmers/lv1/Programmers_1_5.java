package com.programmers.lv1;

public class Programmers_1_5 {
	
	/*
	 * [PCCE 기출문제] 5번 / 심폐소생술
	 * 
	 * 빈칸 채우기 
	 * 
	 * 1.심정지 및 무호흡 확인 [check]
	 * 2.도움 및 119 신고 요청 [call]
	 * 3.가슴압박 30회 시행 [pressure]
	 * 4.인공호흡 2회 시행 [respiration]
	 * 5.가슴압박, 인공호흡 반복 [repeat]
	 * 
	 * 주어진 solution 함수는 심폐소생술을 하는 방법의 순서가 담긴 문자열들이 
	 * 무작위 순서로 담긴 리스트 cpr이 주어질 때 
	 * 각각의 방법이 몇 번째 단계인지 순서대로 담아 return하는 함수입니다. 
	 * solution 함수가 올바르게 작동하도록 
	 * 빈칸을 채워 solution 함수를 완성해 주세요.
	 * 
	 */
    public static void main(String[] args) {
        String[] cpr = {"call", "respiration", "repeat", "check", "pressure"};
        System.out.print(solution(cpr));
    }
    
    public static int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i<cpr.length; i++){ // 입력된 cpr 수만큼 반복
            for(int j=0; j<basic_order.length; j++){ // 해당 배열에서 일치값 찾기 -> 다른 풀이: 이미 배열수가 정해져 있으니 5로 입력 해도 된다
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = j+1; // 일치시 배열 인덱스+1 값 리턴
                    break;
                }
            }
        }
        return answer;
    }
}
