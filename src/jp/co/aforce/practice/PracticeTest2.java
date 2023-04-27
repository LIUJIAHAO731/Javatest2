package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String [] args) {
		//問題１
		double TAX = 0.1;
		System.out.println(TAX);
		
		
		//問題2
		int x = 480;
		double price  = ((TAX*x)+x);
		System.out.println(price);
		
		
		//問題3
		String name = "劉嘉浩";
		System.out.println(name);
		
		
		//問題4
		String ne = "この商品の値段は";
		String en = "円です";
		System.out.println(ne+price+en);
	}
}
