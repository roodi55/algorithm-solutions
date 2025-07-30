package com.programmers.lv1;

import java.util.Scanner;

public class Programmers_1_4 {
	
	/*
	 * [PCCE 기출문제] 4번 / 병과분류
	 * 
	 * 빈칸 채우기 
	 * 
	 * "_eye"	"Ophthalmologyc"
	 * "head"	"Neurosurgery"
	 * "infl"	"Orthopedics"
	 * "skin"	"Dermatology"
	 * 
	 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());

        if(lastFourWords.equals("_eye")){
            System.out.println("Ophthalmologyc");
        }
        else if(lastFourWords.equals( "head" )){
            System.out.println("Neurosurgery");
        }
        else if(lastFourWords.equals( "infl" )){
            System.out.println("Orthopedics");
        }      
        else if(lastFourWords.equals( "skin" )){
            System.out.println("Dermatology");
        }        
        else
        {
            System.out.println("direct recommendation");
        }
    }
    
    // endsWith/ contains 사용 방식도 있음
    public static void otherSolution(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());

        if(lastFourWords.equals("_eye")){
            System.out.println("Ophthalmologyc");
        }
        else if(lastFourWords.equals("head")){
            System.out.println("Neurosurgery");
        }
        else if(code.contains("infl")){
            System.out.println("Orthopedics");
        }
        else if(code.endsWith("skin")){
            System.out.println("Dermatology");
        }
        else {
            System.out.println("direct recommendation");
        }
    }
}
