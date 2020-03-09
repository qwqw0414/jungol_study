package jungol.study.jyc.beginner;

import java.util.Scanner;

import jungol.study.common.Utils;
import jungol.study.impl.beginner.Shapes1Impl;

public class Shapes1 implements Shapes1Impl {

	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Shapes1 s = new Shapes1();
//		s.ex1291();
//		s.ex1339();
		s.ex2046();
	}

	@Override
	public void ex2046() {
//		숫자사각형4
//		정사각형의 한 변의 길이 n과 종류 m을 입력받은 후 다음과 같은 정사각형 형태로 출력하는 프로그램을 작성하시오.

//		< 처리조건 >
//		종류 2번의 경우 숫자의 진행 순서는 처음에 왼쪽에서 오른쪽으로 너비 n만큼 진행 한 후 방향을 바꾸어서 이를 반복한다.

		long ms = 0;
		int n = 0;
		int m = 0;
		
		try {
			System.out.println("100이하의 정수 입력");
			n = sc.nextInt();
			System.out.println("패턴 1,2,3 입력");
			m = sc.nextInt();
		} catch (Exception e) {
			System.out.println("INPUT ERROR!");
		}

		if (n > 0 && n <= 100 && m > 0 && m <= 3) {

			ms = new Utils().timer();
			
			int num = 0;
			
			for(int i = 0; i < n; i++) {
				
//				패턴 1
				if( m == 1) {
					for(int j = 0; j < n; j++) {
						System.out.printf("%2d ",++num);
					}
					num = 0;
				}
//				패턴 2
				else if(m == 2) {
					if(i % 2 == 0) {
						for(int j = 0; j < n; j++) {
							System.out.printf("%2d ",++num);
						}
					}
					else {
						for(int j = 0; j < n; j++) {
							System.out.printf("%2d ",num--);
						}
					}
				}
//				패턴 3
				else {
					for(int j = 0; j < n; j++) {
						System.out.printf("%2d ",++num * (i+1));
					}
					num = 0;
				}
				
				System.out.println();
			}
			
		} else {
			System.out.println("INPUT ERROR!");
		}

		new Utils().timer(ms);
	}

	@Override
	public void ex1339() {
//		문자삼각형2

//		삼각형의 높이 N을 입력받아서 아래와 같이 문자 'A'부터 차례대로 맨 오른쪽 가운데 행부터 차례대로 아래와 같이 채워서 
//		삼각형 모양을 출력하는 프로그램을 작성하시오.
//		< 처리조건 >

//		(1) 오른쪽 가운데 행에 문자 'A'를 채우고 왼쪽 열로 이동하여 위에서 아래로 채워나간다.
//		(2) 가장 왼쪽 행까지 반복하여 모두 채워 나간다. (문자 'Z'다음에는 'A'부터 다시 시작한다.)

		int num = 0;

		System.out.println(">> 1 ~ 100 입력");

		try {
			num = sc.nextInt();
		} catch (Exception e) {
			System.out.println("INPUT ERROR");
		}

		if (num > 0 && num <= 100 && num % 2 != 0) {

			int str = (int) 'A';
			int mid = num / 2 + 1;
			int i = 1;

			do {

				for (int j = 0; j < i; j++) {
					if ((int) 'Z' < str)
						str = (int) 'A';
					System.out.print((char) str++ + " ");
				}
				System.out.println();

				if (num > mid)
					i++;
				else
					i--;

			} while (num-- != 0);

		} else {
			System.out.println("INPUT ERROR");
		}
	}

	@Override
	public void ex1291() {
//	즉 입력된 구간의 범위는 증가하거나 감소하는 순서 그대로 출력되어야 한다.
//	원하는 구구단의 범위를 입력받아 해당 구간의 구구단을 출력하는 프로그램을 작성하시오.
//
//	<처리조건>
//	(1) 구간의 처음과 끝을 입력받는다.
//	(2) 입력된 구간은 반드시 처음 입력 값이 끝의 입력 값보다 작아야 하는 것은 아니다.

		int num1;
		int num2;

		while (true) {
			System.out.println("두 수 입력");

			try {

				num1 = Integer.parseInt(sc.next());
				num2 = Integer.parseInt(sc.next());

				if ((num1 > 1 && num1 <= 9) || (num2 > 1 && num2 <= 9)) {

					if (num1 < num2) {
						int temp = num1;
						num1 = num2;
						num2 = temp;
					}

					for (int i = num1; i >= num2; i--)
						for (int j = 1; j <= 9; j++)
							System.out.println(i + " * " + j + " = " + i * j);

					break;
				}

				else
					System.out.println("INPUT ERROR!");

			} catch (Exception e) {
				System.out.println("INPUT ERROR!");
				sc.nextLine();
			}
		}

	}

	@Override
	public void ex1341() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ex1303() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ex1856() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ex1304() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ex1307() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ex1314() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ex1338() {
		// TODO Auto-generated method stub

	}

}
