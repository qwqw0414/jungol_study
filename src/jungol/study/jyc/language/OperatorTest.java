package jungol.study.jyc.language;

import java.util.Scanner;

public class OperatorTest {
	
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		OperatorTest ot = new OperatorTest();
//		ot.ex1();
		ot.ex2();
	}
	
	private void ex2() {
	
		System.out.println("두 정수 입력.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1 + " / " + num2 + " = " + num1/num2 + "..." + num1%num2);
	}
	
	private void ex1() {
		int[] score = {70,95,63,100};
		int sum = 0;
		int cnt = 0;
		
		for(int num : score) {
			sum += num;
			cnt++;
		}
		
		System.out.printf("sum %d\navg %d",sum,sum/cnt);
	}
}
