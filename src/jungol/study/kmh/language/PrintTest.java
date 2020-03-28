package jungol.study.kmh.language;

public class PrintTest {

	public static void main(String[] args) {
		PrintTest pt = new PrintTest();
		pt.test1();
		pt.test2();
		pt.test3();
		pt.test4();
		pt.test5();
		pt.test6();
		pt.test7();
	}
	
	public void test1() {
		System.out.println("Fun Programming!");
	}
	
	public void test2() {
		System.out.println("Programming! It's fun.");
	}
	public void test3() {
		System.out.println("My name is Hong Gil Dong.\nI am 13 years old.");
	}
	public void test4() {
		System.out.println( "(@) (@) \n" + 
							"(=^.^=) \n" + 
							"(-m-m-)");
	}
	public void test5() {
		System.out.println("I can program well.\nDreams come true.");
	}
	public void test6() {
		System.out.println("My height\n170\nMy weight\n68.600000");
	}
	public void test7() {
		System.out.println("5 Dan\n5 * 2 = 10");
	}
	/*
	 public static int solution(int[][] board, int[] moves) {
		Stack<Integer> stack = new Stack<>();
        int answer = 0;
        
		for(int i=0;i<moves.length;i++){
			for(int j=0;j<board.length;j++){
				if(board[j][moves[i]-1]!=0){
										
					if(stack.empty()){
						stack.push(board[j][moves[i]-1]);
						board[j][moves[i]-1]=0;
						break;
					}else if(stack.peek()==board[j][moves[i]-1]){
						stack.pop();
						board[j][moves[i]-1]=0;
						answer+=2;
						break;
					}else{
						stack.push(board[j][moves[i]-1]);
						board[j][moves[i]-1]=0;
						break;
					}
					
				}
					
			}
		}	
        return answer;
    } 

	 */
}
