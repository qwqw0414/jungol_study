package jungol.study.jyc.language;

public class PrintTest {
	public static void main(String[] args) {
		PrintTest pt = new PrintTest();
//		pt.test1();
//		pt.test2();
//		pt.test3();
//		pt.ex1();
//		pt.ex2();
//		pt.ex3();
//		pt.ex3();
//		pt.ex4();
		pt.ex5();
	}

	private void test1() {
		System.out.println("Fun Programming!");
	}

	private void test2() {
		System.out.println("Programming! It's fun.");
	}

	private void test3() {
		System.out.println("My name is Hong Gil Dong.\nI am 13 years old.");
	}

	private void ex1() {
		System.out.println("My name is Hong");
	}

	private void ex2() {
		System.out.println("My hometown\nFlowering mountain");
	}

	private void ex3() {
		System.out.println("TTTTTTTTTT\r\nTTTTTTTTTT\r\n    TT\r\n    TT\r\n    TT");
	}
	
	private void ex4() {
		int kor = 90;
		int mat = 80;
		int eng = 100;
		int sum = kor + mat + eng;
		int avg = sum/3;
		
		System.out.printf("kor %d\nmat %d\neng %d\nsum %d\navg %d\n",kor,mat,eng,sum,avg);
	}
	
	private void ex5() {
		
		System.out.printf("Seoul %15s\nPusan %15s\nIncheon %15s\nDaegu %15s\nGwangju %15s\n",10312545,3567910,2758296,2511676,1454636);
		
	}
	
	
	
	
	
	
}
