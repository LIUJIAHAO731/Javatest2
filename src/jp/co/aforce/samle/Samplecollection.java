package jp.co.aforce.samle;

public class Samplecollection {
	public static void main(String[] args) {
		
/*　　　
 *  ArrayList<String> fruits = new ArrayList<>();　//リスト
		fruits.add("りんご");
		fruits.add("みかん");
		fruits.add(1,"ぶとう");
		System.out.println(fruits);
		
	
		
		　リストの増減
		 * fruits.remove(0);  //リストから削除
		 * System.out.println(fruits);
		 * fruits.add(0,"すいか");  //リストに追加
		 * System.out.println(fruits);
		 * String fruit = fruits.get(1);  //リストから取り出す
		 * System.out.println(fruit);
		
		fruits.set(1, "メロン");
		System.out.println(fruits);
		
		ArrayList<String> colors = new ArrayList<>();  //練習
		colors.add("青");
		colors.add("黄色");
		colors.add("オレンジ");
		colors.add("緑");
		colors.add("ピンク");
		colors.add("紫");
		System.out.println(colors.get(5));
		
		colors.remove("青");
		System.out.println(colors);
		
		colors.add(2,"水色");
		colors);
		
		String color = colors.get(1);
		System.out.println(colors);
		
		colors.set(6, "白");
		colors.add(0,"黒");
		
		System.out.println(colors.get(6));
		
		
		HashMap<String, String> members = new HashMap<>();  //マップの要素追加
		System.out.println(members.put("naka@s.jp", "中垣"));
		System.out.println(members.put("haya@s.jp", "林"));
		System.out.println(members);
		
		System.out.println(members.remove("naka@s.jp"));  //マップ要素の削除
		System.out.println(members.remove("haya@s.jp"));
		System.out.println(members);
		
		System.out.println(members.put("naka@s.jp", "中原"));  //マップの上書き
		System.out.println(members);
		
		System.out.println(members.get("naka@s.jp"));  //マップ要素の取得
		String member = members.get("haya@s.jp");
		System.out.println(member);
        
        
        
        HashMap<String, String> members = new HashMap<>();  //練習問題
	    members.put("A001", "田中太郎");
		members.put("A002", "佐藤次郎");
		members.put("A003", "山田花子");
		members.put("A004", "佐藤次郎");
		System.out.println(members);
		
		members.remove("A003","山田花子");
		System.out.println(members);
		
		members.put("A004", "高橋三郎");
		System.out.println(members);
	 */
		
		String[]singo = {"赤","黄","青"};
		System.out.println(singo[0]);
		singo[2] = "緑";
		System.out.println(singo[2]);
		System.out.println(singo[1]);
		
		String[]number = {"1","2","3","4","5"};
		System.out.println(number[4]);
		
		
	}
}
