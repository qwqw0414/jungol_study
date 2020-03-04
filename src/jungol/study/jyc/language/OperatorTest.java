package jungol.study.jyc.language;

import java.util.Scanner;

public class OperatorTest {
	
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		OperatorTest ot = new OperatorTest();
//		ot.ex1();
//		ot.ex2();
//		ot.ex3();
//		ot.ex4();
		ot.ex5();
	}
	
	private void ex5() {
		int[] a = {150,35};
		int[] b = {145, 35};
		
		System.out.println(a[0]>b[0] ? (a[1]>b[1] ? 1 : 0 ) : 0);
	}
	
	private void ex4() {
		int num1 = 10;
		int num2 = 15;
		
		System.out.println(++num1 + "\t" + num2--);
		System.out.println(num1 + "\t" + num2);
	}
	
	private void ex3() {
		int num1 = 20;
		int num2 = 15;
		
		num1 += 5;
		num2 *= 2;
		
		System.out.printf("width = %d\nlength = %d\narea = %d",num1,num2,num1*num2);
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
		
		for(int num : score) {
			sum += num;
		}
		
		System.out.printf("sum %d\navg %d",sum,sum/score.length);
	}
}
