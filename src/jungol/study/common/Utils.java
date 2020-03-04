package jungol.study.common;

import java.util.Date;
import java.util.Scanner;

public class Utils {
	
	public Scanner sc = new Scanner(System.in);
	
	public long timer() {
		System.out.println(">>> Start");
		return new Date().getTime();
	}
	
	public void timer(long ms) {
		ms = new Date().getTime() - ms;
		System.out.println(">>> End 경과시간 ["+ms+"ms]");
	}
}
