package chap02;		//パッケージ「chap02」の宣言

//演習「2-1」小数部を持つ実数値を「x」と「y」に代入した場合の考察

public class E2_1 {	//クラス「E2_1」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		int x;	//計算に使用する「変数x」をint型で宣言
		int y;	//計算に使用する「変数y」をint型で宣言

		x = 63.5;	//「変数x」に「63.5」を代入
		y = 18.3;	//「変数y」に「18.3」を代入

		//「変数x」の値を画面に表示後改行
		System.out.println("xの値は" + x + "です。");

		//「変数y」の値を画面に表示後改行
		System.out.println("yの値は" + y + "です。");

		//二つの変数の合計を計算し、結果を画面に表示後改行
		System.out.println("合計は" + (x + y) + "です。");

		//二つの変数の平均を計算し、結果を画面に表示後改行
		System.out.println("平均は" + (x + y) /2 + "です。");

	}	//「main」メソッドの終わり
}	//クラス「E2_1」の終わり

/*
「変数x」と「変数y」はint型の変数として宣言されている為、小数部を持つ実数値を代入しようとした場合、
型の不一致が発生し代入できない。
*/
