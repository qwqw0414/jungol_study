package jungol.study.hajin;

import java.util.Scanner;

public class hajin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("구구단 숫자 2개 입력");
			int num = sc.nextInt();
			int num1 = sc.nextInt();
			
			if ((num <= 0 || num > 9) || (num1 <=0 || num1 >9)) {
				System.out.println("다시 입력");
			} 
			else {
				if(num<num1) {
					
					for (int i = num; i <= num1; i++) {
						
						for (int j = 1; j < 10; j++) {
							System.out.println(i + "*" + j + "=" + i * j);
						}
						
					}
				}
				else {
					for (int i = num1; i <= num; num--) {

						for (int j = 1; j < 10; j++) {
							System.out.println( num + "*" + j + "=" + num * j);
						}

					}
				}
				return;
			}
		}
		

	}

}
