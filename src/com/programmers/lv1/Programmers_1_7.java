package com.programmers.lv1;

public class Programmers_1_7 {
	
	/*
	 * [PCCE 기출문제] 7번 / 버스
	 * 
	 * 빈칸 
	 * 
	 * 영진이는 약속장소에 가기 위해 버스를 타려고 합니다. 
	 * 버스에는 좌석이 총 seat개만큼 있습니다. 
	 * 영진이는 버스 좌석에 앉아서 갈 수 있을지 궁금해합니다. 
	 * 기점에서 출발한 버스가 영진이가 기다리는 정거장에 도착하기 전에 
	 * 방문하는 각 정거장에서 승/하차한 승객 정보가 주어질 때, 
	 * 영진이가 버스에 탄 순간 빈 좌석은 몇 개인지 구해주세요. 
	 * 영진이가 기다리는 정거장에서는 영진이가 제일 먼저 버스에 탑승하며, 
	 * 이전 정거장에서 버스에 탑승한 승객들은 남는 좌석이 있다면 항상 앉는다고 가정합니다. 
	 * 또, 기점에서 출발하는 버스에는 승객이 0명 타고 있습니다.
	 * 
	 */
    public static void main(String[] args) {
        int seat = 5;
        String[][] passengers = {{"On", "On", "On"}, {"Off", "On", "-"}, {"Off", "-", "-"}};
        System.out.print(solution(seat, passengers));
    }
    
    public static int solution(int seat, String[][] passengers) {
        int num_passenger = 0;
        for(int i=0; i<passengers.length; i++){
            num_passenger += func3(passengers[i]);
            num_passenger -= func4(passengers[i]);
        }
        int answer = func1( num_passenger + seat );
        
        // 다른 풀이
//        for(int i=0; i<passengers.length; i++){
//            num_passenger += func4(passengers[i]);
//            num_passenger -= func3(passengers[i]);
//        }
//        int answer = func1(seat-num_passenger);
        
        return answer;
    }

    public static int func1(int num){
        if(0 > num){
            return 0;
        }
        else{
            return num;
        }
    }
    public static int func2(int num){
        if(num > 0){
            return 0;
        }
        else{
            return num;
        }
    }

    public static int func3(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("Off")){
                num += 1;
            }
        }
        return num;
    }

    public static int func4(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("On")){
                num += 1;
            }
        }
        return num;
    }
}
