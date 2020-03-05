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

		int n = 9;
		int m = 1;
		
		int d = n / 2 + 1;

		for (int i = 0; i < n; i++) {

//			종류1
			if (i <= m)
				System.out.println(getStar(n, 0, i));
			else
				System.out.println(getStar(n, 0, n-i));
		}

		u.timer(ms);
	}

	public String getStar(int width, int start, int end) {

		String str = "";

		for (int i = 0; i < width; i++) {

			if (i >= start && i <= end)
				str += "* ";
			else
				str += "  ";
		}

		return str;
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
