package chap02;		//パッケージの宣言

//演習「2-7-2」1桁の負の整数をランダムで表示

import java.util.Random;	//乱数生成に必要な決まり文句。クラス宣言の前に書く

public class E2_7_2 {	//クラス「E2_7_2」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//生成された乱数を格納する変数を作成
		Random iNrand = new Random();

		/*
		0～8の間で乱数を生成し、1を足すことで1～9整数が作成される。
		その値をint型の変数「iRand」に代入
		*/
		int iRand = iNrand.nextInt(9) + 1;

		//変数「iRand」に-演算子をつけ符号を反転した値をint型変数「iFusu」に代入
		int iFusu = -iRand;

		//生成された値を画面に表示
		System.out.println("生成された負の整数は" + iFusu + "です。");

	}	//「main」メソッドの終わり
}	//クラス「2_7_2」の終わり
