package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest3 {
	public static void main(String[] args) {

		//練習問題１

		ArrayList<String> mono = new ArrayList<>();
		mono.add("シャープペンシル");
		mono.add("ボールペン");
		mono.add("リングノート");
		mono.add("クリップ");
		mono.add("消しゴム");

		System.out.println(mono);

		//練習問題2

		String monos = mono.get(1);
		System.out.println(monos);

		//練習問題3

		ArrayList<String> members = new ArrayList<>();
		members.add("山田太郎");
		members.add("鈴木花子");
		members.add("佐藤二郎");
		members.add("山田太郎");
		members.add("高橋三郎");
		System.out.println(members);

		//練習問題5
		
		String member = members.get(2);
		System.out.println(member);
	}
}
