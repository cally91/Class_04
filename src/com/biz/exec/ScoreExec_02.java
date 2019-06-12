package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_02 {

	public static void main(String[] args) {

		/*
		 *scorevo 배열을 5개 생성하고
		 *키보드로 부터 5명 학생의 학번 국어 영어 수학 점수를 입력받고
		 *각 배열에 저장한후
		 *리스트에 toString()으로 보이시오 
		 */
		
		ScoreVO[] sVOs= new ScoreVO[5];
		Scanner mud= new Scanner(System.in);
		
		
		for(int i = 0;i<sVOs.length;i++) {
			
			System.out.print("학번>");
			 String strnum=mud.nextLine();
			
			System.out.print("국어점수>");
			String strkor =mud.nextLine();
			int intkor=Integer.valueOf(strkor);
			
			System.out.print("영어점수>");
			String streng =mud.nextLine();
			int inteng=Integer.valueOf(streng);
	
			System.out.print("수학점수>");
			String strmath =mud.nextLine();
			int intmath=Integer.valueOf(strmath);
			
			ScoreVO sVO =new ScoreVO();
			sVO.setNumber(strnum);
			sVO.setKor(intkor);
			sVO.setEng(inteng);
			sVO.setMath(intmath);
			
			
			
		}
		
		
		
	}

}
