package chap02;		//パッケージの宣言

//演習「2-9-3」-1.0以上1.0未満の実数値をランダムに生成して表示

import java.util.Random;	//乱数を生成するために必要な決まり文句。クラス宣言の前に書く

public class E2_9_3 {	//クラス「E2_9_3」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//乱数を格納する変数を作成
		Random rand = new Random();

		//変数「dRand1」をdouble型で作成し、生成された乱数を代入
		double dRand1 = rand.nextDouble();

		//変数「dRand2」をdouble型で作成し、生成された乱数を代入
		double dRand2 = rand.nextDouble();

		//生成された乱数の合計を画面に表示
		System.out.println("-1.0以上1.0未満の実数値を表示します。" + ( dRand1 + -dRand2 ) + "です。");

	}	//「main」メソッドの終わり

}	//クラス「E2_9_3」の終わり
