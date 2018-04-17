package chap02;		//パッケージの宣言

//演習「2-9-1」0.0以上1.0未満の実数値をランダムに生成して表示

import java.util.Random;	//乱数の生成に必要な決まり文句。クラス宣言の前に書く

public class E2_9_1 {	//クラス「E2_9_1」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//生成された乱数を格納する変数を作成
		Random dNrand = new Random();

		//変数「dJissu」をdouble型で作成し、生成された乱数を代入
		double dJissu = dNrand.nextDouble();

		//生成された乱数を画面に表示
		System.out.println("0.0以上1.0未満の実数値を表示します。" + dJissu + "です。");

	}	//「main」メソッドの終わり

}	//クラス「E2_9_1」の終わり
