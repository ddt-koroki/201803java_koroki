package chap02;		//パッケージの宣言

//演習「2_7_3」正の整数値(10～99)をランダムに表示するプログラム

import java.util.Random;	//乱数を生成する為に必要な決まり文句。クラス宣言の前に書く

public class E2_7_3 {	//クラス「E2_7_3」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//生成された乱数を格納する変数を作成
		Random iNrand = new Random();

		/*
		0～89の間で乱数を生成し、10を足すことで10～99の整数が作成される。
		その値をint型で作成した変数「iSeisu」に代入
		*/
		int iSeisu = iNrand.nextInt(90) + 10;

		//生成された値を画面に表示
		System.out.println("生成された整数は" + iSeisu + "です。");

	}	//「main」メソッドの終わり
}	//クラス「E2_7_3」の終わり
