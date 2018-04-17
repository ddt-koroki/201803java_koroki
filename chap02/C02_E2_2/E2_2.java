package chap02;		//パッケージ「chap02」の宣言

//三つの変数の合計と平均を求めるプログラム

public class E2_2 {	//クラス「E2_2」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		int iAtai1, iAtai2, iAtai3;	//計算に使用する変数をint型で宣言

		iAtai1 = 5;		//変数「iAtai1」に5を代入
		iAtai2 = 10;	//変数「iAtai2」に10を代入
		iAtai3 = 15;	//変数「iAtai3」に15を代入

		//変数「iAtai1」に代入されている値を表示
		System.out.println("iAtai1の値は" + iAtai1 + "です。");

		//変数「iAtai2」に代入されている値を表示
		System.out.println("iAtai2の値は" + iAtai2 + "です。");

		//変数「iAtai3」に代入されている値を表示
		System.out.println("iAtai3の値は" + iAtai3 + "です。");

		//三つの変数の合計を計算し、結果を表示
		System.out.println("合計は" + (iAtai1 + iAtai2 + iAtai3) + "です。");

		//三つの変数の平均を計算し、結果を表示
		System.out.println("平均は" + (iAtai1 + iAtai2 + iAtai3)/3 + "です。" );

	}	//「main」メソッドの終わり
}	//クラス「E2_2」の終わり
