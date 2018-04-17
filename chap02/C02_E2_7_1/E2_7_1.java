package chap02;		//パッケージの宣言

//演習「2-7-1」1桁の正の整数(1～9)をランダムで表示

import java.util.Random;	//乱数生成に必要な決まり文句。クラス宣言の前に書く

public class E2_7_1 {	//クラス「E2_7_1」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//生成された乱数を格納する変数を作成
		Random iNrand = new Random();

		/*
			0～8の間で乱数を生成し、1を足すことで1～9の整数が作成される。
			その値をint型の変数「iRand」に代入
		*/
		int iRand = iNrand.nextInt(9) + 1;

		//生成された整数を画面に表示
		System.out.println("生成された整数は" + iRand + "です。");

	}	//「main」メソッドの終わり
	
}	//クラス「E2_7_1」の終わり