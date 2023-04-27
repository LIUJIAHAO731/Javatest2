package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest6 {
	public static void main(String[] args) {

		//練習問題1  できませんでした。
		
		Random random = new Random();
		
		int fortune = random.nextInt(4)+1;
		
		System.out.println("fortune:"+"fortune");

		switch(fortune) {
		case 1:
			System.out.println("吉です");
		break;
		case 2:
			System.out.println("中吉です");
		break;
		case 3:
			System.out.println("大吉です");
		break;

		default:
			System.out.println("凶です");
		break;
		
		
		}
		
		

		//練習問題2

		int x = 1;
		while (x <= 100) {
			if (x % 7 == 0) {
				System.out.println(x);
			}
			x++;
		}

		//練習問題3

		for (int i = 1; i <= 9; i++) {
			for (int m = 1; m <= 9; m++) {
				int j = i*m;
				
				System.out.println("");
				if(10>j)
					System.out.println("");
				
				System.out.println(j);
			}
			
			System.out.println();
		}
	}
}
