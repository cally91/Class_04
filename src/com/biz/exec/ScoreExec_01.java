package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_01 {
public static void main(String[] args) {
	
	/*
	 * 키보드에서 학번,이름 국어 영어,수학점수를
	 * 각각 입력받아 sVO 각 필드에 대입하고(저장)하고
	 * 저장된 값을 콘솔에 보이세요
	 */
	
	ScoreVO sVO= new ScoreVO();
	Scanner scan =new Scanner(System.in);
	
	System.out.print("학번>");
	String strNum =scan.nextLine();
	
	System.out.print("이름 (영문)>");
	String strName=scan.nextLine();

	System.out.print("국어점수>");
			String strkor =scan.nextLine();
			int intkor=Integer.valueOf(strkor);
			
			System.out.print("영어점수>");
			String streng =scan.nextLine();
			int inteng=Integer.valueOf(streng);

			System.out.print("수학점수>");
			String strmath =scan.nextLine();
			int intmath=Integer.valueOf(strmath);
			
			sVO.setNumber(strNum);
			sVO.setName(strName);
			sVO.setKor(intkor);
			sVO.setEng(inteng);
			sVO.setMath(intmath);
			
			System.out.print(sVO.toString());


}
}
