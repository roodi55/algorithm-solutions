package com.programmers.lv1;

public class Programmers_1_6 {
	
	/*
	 * [PCCE 기출문제] 5번 / 물부족
	 * 
	 * 디버깅 
	 * 
	 * [10, -10, 10, -10, 10, -10, 10, -10, 10, -10]
	 * 리스트의 각 원소는 해당 월의 물 사용량이 전 달에 비해 몇 % 만큼 증가 또는 감소하는지를 나타냅니다.
	 * 
	 * 예를 들어, 이번달의 물 사용량 (리스트의 첫 번째 원소)은 지난 달 보다 10% 증가한 값이며, 
	 * 다음 달(리스트의 두 번째 원소)의 물 사용량은 이번달 사용량에서 10%만큼 감소한 값입니다.
	 * 자세한 값은 입출력 예시를 참고해 주세요.
	 * 현재 저수지에 저장된 물의 양을 나타내는 정수 storage와 지난 달 물 사용량을 나타내는 정수 usage, 
	 * 월별 물 사용량이 전 달 대비 어떻게 변하는지 저장된 정수 리스트 change가 주어질 때 
	 * 몇 달 뒤 물이 부족해지는지 return 하도록 solution 함수를 작성하려 합니다. 
	 * 코드가 올바르게 작동하도록 한 줄을 수정해 solution 함수를 완성해 주세요. 
	 * 가뭄이 끝날때 까지 저수지의 물이 남아 있다면 -1을 return합니다.
	 * 
	 */
    public static void main(String[] args) {
        int storage = 5141;
        int usage = 500;
        int[] change = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};
        System.out.print(solution(storage, usage, change));
    }
    
    public static int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
        	//usage = total_usage * change[i] / 100; 기존 문제
        	
        	// 사용량은 이전달의 사용량에 change[i]%만큼 더해야 하므로
            usage = usage + (usage * change[i] / 100);
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}
