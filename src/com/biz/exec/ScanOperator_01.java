package com.biz.exec;

import java.util.Scanner;

public class ScanOperator_01 {

	Scanner scan;
	int intNum1;
	int intNum2;

	public ScanOperator_01() {
		scan = new Scanner(System.in);
	}

	public void Keyiuput() {
		System.out.print("숫자1>");
		String strNum1 = scan.nextLine();
		intNum1 = Integer.valueOf(strNum1);

		System.out.print("숫자2>");
		String strNum2 = scan.nextLine();
		intNum2 = Integer.valueOf(strNum2);

	}

	public void add() {
		int intsum = intNum1 + intNum2;
		System.out.printf("덧셈 : %d+%d=%d\n", intNum1, intNum2, intNum1 + intNum2);
	}

	public void minus() {
		int intminus = intNum1 - intNum2;
		System.out.printf("뺄셈 : %d-%d=%d\n", intNum1, intNum2, intNum1 - intNum2);
	}

	public void times() {
		int intTinus = intNum1 * intNum2;
		System.out.printf("곱셈 : %dx%d=%d\n", intNum1, intNum2, intNum1 * intNum2);

	}

	public void devide() {
		int intDinus = intNum1 / intNum2;
		System.out.printf("나눗셈 : %d/%d=%d\n", intNum1, intNum2, intNum1 / intNum2);

	}
}
