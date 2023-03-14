package day9;

import java.util.Scanner;

// 부루마블
public class Q908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("주사위 start : ");
//		String s = sc.next();
		int ran = (int)(Math.random()*9)+1;
		char[][] board = new char[11][11];
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board.length; j++) {
				board[i][j] = 'o';
				System.out.print(board[i][j]);
			}
			System.out.println();
			
		}
//		if(s.equals("start")) {
//			
//		}
	}
}
