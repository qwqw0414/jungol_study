package jungol.study.jyc.language;

import java.util.Date;

public class DebugTest {

	public static void main(String[] args) {

		DebugTest dt = new DebugTest();
//		dt.ex1();
//		dt.ex2();
//		dt.ex3();
		dt.ex4();
	}

	private void ex4() {
		int a = 0;
		
		Date now = new Date();
		long time_t = now.getTime();
		
//		C언어 문제 
	}
	
	private int ex3() {
		int a = 5;
		a += 10;
		a = a - 1;
		System.out.printf("%d\n", a);
		return 0;
	}

	private void ex2() {
		
		double[] scoreArr = { 70.5, 95.5, 68.5 };
		int sum = 0;
		double avg = 0;
		
		for(double score : scoreArr) {
			sum += score;
			avg += score;
		}
		
		System.out.println("sum " + sum);
		System.out.println("avg " + (int)(avg/scoreArr.length));
		
	}

	private void ex1() {

		int[] numArr = { 70, 95, 65 };
		double sum = 0;

		for (int num : numArr) {
			sum += num;
		}

		double avg = Math.round(sum * 10 / numArr.length) * 0.1;

		System.out.println(avg);
	}
}
