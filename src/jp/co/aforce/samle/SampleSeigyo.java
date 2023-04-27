package jp.co.aforce.samle;

public class SampleSeigyo {
	public static void main(String[] args) {

		/*
		   int x = 10;   //【分岐】ifの基本構文
		   if(x < 100) {
			
			System.out.println("条件に一致しました");
			System.out.println("処理を実行します");
		}
		}
		}
		
		 */

		/*
		   int x = 10;   //【分岐】else基本構文
		   if(x < 100) {
			
			System.out.println("ｘは100より小さい");	
		} else {
			System.out.println("xは100以上");
		}
		}
		
		 */

		/*  【分岐】if-else  if-else基本構文
		 int x = 200;   // 
		 if(x < 100) {
		
		   System.out.println("ｘは100より小さい");
		 } else if(x<200) {
		   System.out.println("ｘは200より小さい");
		 }
		 else {
		   System.out.println("xは200以上");  
		
		}
		
		}
		
		 */

		/*   // if,else ifの練習問題
		 * int value = 10;  
		 * if(value == 0) {         // 　＝一つだと変数　＝＝二つは値
			System.out.println("値は0です");
		} else if(1<=value && value<= 5) {
			System.out.println("値は1以上5以下です");
		} else {
			System.out.println("値は"+value+"です");
		}
		}
		}
		 */

		/*   //switch文の構成
		 * int x = 1;   
		 * switch(x) {
			case 1:
				System.out.println("xの値は1です");
				break;
			case 2:
				System.out.println("xの値は2です");
			default:
				System.out.println("xの値は1でも2でもない");
				break;
		}
				
		}
		
		}
		
		 */

		/*
		Calendar calendar= Calendar.getInstance();   //switch分を使った曜日get練習問題
		String dayOfWeek;
		switch(calendar.get(Calendar.DAY_OF_WEEK)) {   //曜日を手に入れる
		case 1:
			dayOfWeek = "日";
			break;
		case 2:
			dayOfWeek = "月";
			break;
		case 3:
			dayOfWeek = "火";
			break;
		case 4:
			dayOfWeek = "水";
			break;
		case 5:
			dayOfWeek = "木";
			break;
		case 6:
			dayOfWeek = "金";
			break;
		default:
			dayOfWeek = "土";
			break;
		}
		System.out.println("今日は"+dayOfWeek+"曜日です");  //文字列＋変数現在の曜日
		 */

		/*
		 int x = 1;          //while文の構成
		 int amount = 0;
		
		while(amount < 10) {     //条件設定　10より小さい場合
			System.out.println(x+"を足します");  
			amount = amount + x; 
			x++; //ひとつづつ増やす
			}
		System.out.println("合計は"+ amount);
		 */

		/* 
		 * int amount = 1;   //1-30の中3の倍数だけ取り出す練習問題（まだ理解できていない）
		 * while(amount <= 30) {
			if(amount%3==0) {
				System.out.println(amount);
			}
			amount++;
			}
		
		 */

		/*      //do while文の構成
		 int amount = 0;
		
		do {
			System.out.println(x+"を足します");
			amount = amount + x;
			x++;
		}while(amount<10);
		System.out.println("合計は"+amount);
		}
		}
		 */

		/*    //2の倍数練習問題（割るで解）
		 * int conte = 1;
		   do {
			if (conte % 2 == 0) {
				System.out.println(conte);
			}
			conte++;
		} while (conte < 10);
		
		
		}
		}
		 */

		/*     //2の倍数練習問題(シンプル）    
		    int number = 2;
		    do {
			System.out.println(number);
			number += 2;
		}while(number<10);
		
		}
		}
		 */

		/*  // for文の構成
		 * for(int i = 3; i> 0; i--) {
		 * System.out.println(i+"回目");
		}
		}
		}
		 */

		/*  //for文の練習問題（4の九九かけ）
		 * for(int ka = 1; ka<=9; ka++) {
			System.out.println("4x"+ka+"="+(4*ka));
		}
		}
		}
		 */

		
		
		/*  //for+配列文の構成
		String[] fruits= new String[3];
		fruits[0] = "リンゴ";
		fruits[1] = "オレンジ";
		fruits[2] = "ブトウ";
		
		for(int i = 0; i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		}
		}
		 */

		
		
		/*  //for+配列文の構成の練習（曜日を英語表示）
		String[] yobi = new String[7];
		yobi[0] = "日";
		yobi[1] = "月";
		yobi[2] = "火";
		yobi[3] = "水";
		yobi[4] = "木";
		yobi[5] = "金";
		yobi[6] = "土";
		
		String[] E = new String[7];
		E[0] = "Sun" ;
		E[1] = "Mon" ;
		E[2] = "Tue" ;
		E[3] = "Wed" ;
		E[4] = "Thu" ;
		E[5] = "Fri" ;
		E[6] = "Sat" ;
		
		for(int i = 0; i<yobi.length ;i++) {
			System.out.println(yobi[i]+"曜日は英語では"+E[i]+"です");
		}
		}
		}
		 */

		
		
		/*  //拡張forの構成（コレクション）
		HashSet<String> books = new HashSet<>();
		books.add("不思議の国のアリス");
		books.add("ヘンゼルとグレーテル");
		books.add("銀河鉄道の夜");
		
		for(String book:books) {
			System.out.println(book);
		}
		}
		}
		*/

		
		
		/*  //breakの使い方
		for (int i = 0; i < 5; i++) {
			if(i == 3) {
				break;
			}
			
			System.out.println(i);
		}
		}
		}
		*/

		
		
		/*  //break文の練習
		int count = 0;
		while(true) {
			
			if(count==5){
			break;
		}
		count++;
		}
		System.out.println(count);
		}
		}
		*/

		
		/*  // continueの構文
		for (int i = 0; i < 7; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
			System.out.println("プログラム終了");
		
	}
}
		*/
		
		
		/*  //continueの練習問題
		for(int i = 0; i<=10;i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
		*/
		
		
	}
}