package com.programmers.lv1;


public class Programmers_1_15 {
	
	/*
	 * [PCCE 기출문제] 7번 / 가습기
	 * 
	 * 빈칸
	 * 
	 *  상우가 사용하는 가습기에는 "auto", "target", "minimum"의 세 가지 모드가 있습니다. 
	 *  가습기의 가습량은 0~5단계로 구분되며 각 모드 별 동작 방식은 다음과 같습니다.
	 *  
	 *  "auto" 모드
	 *  습도가 0 이상 10 미만인 경우 : 5단계
	 *  습도가 10 이상 20 미만인 경우 : 4단계
	 *  습도가 20 이상 30 미만인 경우 : 3단계
	 *  습도가 30 이상 40 미만인 경우 : 2단계
	 *  습도가 40 이상 50 미만인 경우 : 1단계
	 *  습도가 50 이상인 경우 : 0단계
	 *  
	 *  "target" 모드
	 *  습도가 설정값 미만일 경우 : 3단계
	 *  습도가 설정값 이상일 경우 : 1단계
	 *  
	 *  "minimum"모드
	 *  습도가 설정값 미만일 경우 : 1단계
	 *  습도가 설정값 이상일 경우 : 0단계
	 * 
	 */
	public static void main(String[] args) {
		
        System.out.println(solution("auto", 23,	45));
    }
	
	public static int func1(int humidity, int val_set){
        if(humidity < val_set)
            return 3;// 빈칸 
        return 1;
    }

    public static int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else // 빈칸 
            return 5;// 빈칸 
    }

    public static int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return 0;// 빈칸 
    }

    public static int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func2(humidity); // 빈칸 
        }
        else if(mode_type.equals("target")){ 
            answer = func1(humidity,val_set);// 빈칸 
        }
        else if(mode_type.equals("minimum")){
            answer = func3(humidity,val_set);// 빈칸 
        }

        return answer;
    }
}
