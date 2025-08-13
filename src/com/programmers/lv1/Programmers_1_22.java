package com.programmers.lv1;


public class Programmers_1_22 {
	
	/**
	 * 문자열 겹쳐쓰기
	 * 
	 * 코드 작성
	 * 
	 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
	 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
	 * 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        
        solution(my_string, overwrite_string, s);
    }
	
	public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer = my_string.substring(0,s) //  s인덱스 전까지 추출
                + overwrite_string  // 덮어씌울 문자
            + my_string.substring(s + overwrite_string.length(), my_string.length()); // 덮어쓴 이후 문자 추출
        
        return answer;
    }
	
	// 다른 풀이
	public String otherSolution(String my_string, String overwrite_string, int s) {
		 String before = my_string.substring(0, s);
		 String after = my_string.substring(s + overwrite_string.length());
	     return before + overwrite_string + after;
	 }
}
