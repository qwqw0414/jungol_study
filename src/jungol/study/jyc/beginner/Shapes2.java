package jungol.study.jyc.beginner;

import jungol.study.common.Utils;
import jungol.study.impl.beginner.Shapes2Impl;

public class Shapes2 implements Shapes2Impl {

	Utils u = new Utils();

	public static void main(String[] args) {
		Shapes2 s = new Shapes2();
		s.ex1719();
	}

	@Override
	public void ex1523() {

	}

	@Override
	public void ex1719() {
//		별삼각형2
		long ms = u.timer();

		int n = 5;
		int m = 3;

		int d = n / 2;
		
//		Type 1
		if (m == 1) {
			for (int i = 0; i < n; i++) {
				
				for (int j = 0; j <= d - Math.abs(d-i); j++)
					System.out.print("* ");
				
				System.out.println();
			}
		}

//		Type 2
		if (m == 2) {
			for (int i = 0; i < n; i++) {
				
				for (int j = 0; j < Math.abs(d-i); j++)
					System.out.print("  ");
				
				for( int j = 0; j <= d - Math.abs(d-i); j++)
					System.out.print("* ");
				
				System.out.println();
			}
		}

//		Type3

		u.timer(ms);
	}

	@Override
	public void ex1329() {

	}

	@Override
	public void ex1641() {

	}

	@Override
	public void ex1337() {

	}

	@Override
	public void ex2071() {

	}

	@Override
	public void ex1707() {

	}

	@Override
	public void ex1331() {

	}

	@Override
	public void ex1495() {

	}

	@Override
	public void ex2074() {

	}

}
