package jungol.study.jyc.language;

import java.util.Scanner;

import jungol.study.common.Utils;

public class IfTest {
	
	Utils u = new Utils();
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		IfTest it = new IfTest();
//		it.ex1();
		it.ex5();
	}
	
	private void ex5() {
		
		int month = 2;
		
		if(month == 2) {
			System.out.println(28);
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(30);
		}
		else {
			System.out.println(31);
		}
		
	}
	
	private void ex1() {

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		long ms = u.timer();
		
		if(num1>num2) 
			System.out.println(num1 - num2);
		else
			System.out.println(num2 - num1);
		
		u.timer(ms);
		
	}
	
}
