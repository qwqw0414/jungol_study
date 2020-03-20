package jungol.study.cjy;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("시작 단 입력 :");
			int startInt = sc.nextInt();
			
			System.out.println("끝 단 입력 :");
			int endInt = sc.nextInt();
			
			if (startInt < 1 || startInt > 9 || endInt < 1 || endInt > 9) {
				System.out.println("INPUT ERROR!");
			}
			if(startInt < endInt) {
				for (int j = 1; j < 10; j++) {
					for (int i = startInt; i < endInt + 1; i++) {
						System.out.print(i + "*" + j + "=" + (i * j)+"  ");
					}
					System.out.println();
				}
			}
			else {
				for (int j = 1; j < 10; j++) {
					for (int i = startInt; i > endInt - 1; i--) {
						System.out.print(i + "*" + j + "=" + (i * j)+"  ");
					}
					System.out.println();
				}
			}
		}
	}

}

