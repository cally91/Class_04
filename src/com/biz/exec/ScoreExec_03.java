package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_03 {

	public static void main(String[] args) {

		ScoreVO[] sVOs =new ScoreVO[5];
		Scanner scan =new Scanner(System.in);
		
		for (int i=0;i <sVOs.length;i++) {
			System.out.print("입력방법 학번 국어 영어 수학>>");
			String strkeyiut =scan.nextLine();
			
			String[] strKeys= strkeyiut.split(",");
			
			String strNumder= strKeys[0];
			
			int intkor =Integer.valueOf(strKeys[1]);
			int inteng=Integer.valueOf(strKeys[2]);
			int intmath 	 =Integer.valueOf(strKeys[3]);
			
			ScoreVO sVO =new ScoreVO();
			sVO.setNumber(strNumder);
			sVO.setKor(intkor);
			sVO.setEng(inteng);
			sVO.setMath(intmath);
			
			sVOs[i]=sVO;
					
			
		}for (int i =0 ;i< sVOs.length;i++) {
			System.out.println(sVOs.toString());
		}
	}

}
