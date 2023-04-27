package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;

public class PracticeTest5 {

	public static void main(String[] args) {

		//練習問題２

		ArrayList<String> Animals = new ArrayList<>();
		Animals.add("犬");
		Animals.add("猫");
		Animals.add("うさぎ");
		Animals.add("へび");

		//練習問題3

		String favoriteAnimal="犬";
		
		if(Animals.contains(favoriteAnimal)) {
			System.out.println(favoriteAnimal+"はリストに含まれています");
		}else {
			System.out.println(favoriteAnimal+"はリストに含まれていません");
		}
		
		
		//練習問題4
		
		
		Calendar calendar = Calendar.getInstance();
		String Month;
		switch(calendar.get(Calendar.MONTH)) {
		case 1:
			Month = "冬物セール";
			break;
		case 2:
			Month = "春物を売る";
			break;
		case 3:
			Month = "春物を売る";
			break;
		case 4:
			Month = "春物を売る";
			break;
		case 5:
			Month = "春物セール";
			break;
		case 6:
			Month = "夏物を売る";
			break;
		case 7:
			Month = "夏物を売る";
			break;
		case 8:
			Month = "夏物セール";
			break;
		case 9:
			Month = "秋物を売る";
			break;
		case 10:
			Month = "冬物を売る";
			break;
		case 11:
			Month = "冬物を売る";
			break;
		case 12:
			Month = "冬物を売る";
			break;
		default:
			Month = "不正な月";
			
		}
		System.out.println(Month);
	}

}
