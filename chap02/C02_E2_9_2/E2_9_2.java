package chap02;		//パッケージの宣言

//演習「2-9-2」0.0以上10.0未満の実数値をランダムに生成して表示

import java.util.Random;	//乱数を生成するために必要な決まり文句。クラス宣言の前に書く

public class E2_9_2 {	//クラス「E2_9_2」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//生成された乱数を格納する変数を作成
		Random rand = new Random();

		//変数「iSeisu」をint型で作成し、0～9の間で作成された乱数を代入
		int iSeisu = rand.nextInt(10);

		//変数「dJissu」をdouble型で作成し、作成された乱数を代入
		double dJissu = rand.nextDouble();

		//作成した乱数の合計を画面に表示
		System.out.println("0.0以上10.0未満の実数値を表示します。" + ( iSeisu + dJissu ) + "です。");

	}	//「main」メソッドの終わり

}	//クラス「E2_9_2」の終わり
