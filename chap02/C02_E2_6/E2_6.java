package chap02;		//パッケージの宣言

//演習「2-6」三角形の面積を表示するプログラム

import java.util.Scanner;	//キーボードからの読み込みを可能にする決まり文句。プログラムの先頭に書く。

public class E2_6 {	//クラス「E2_6」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから読み込んだ実数値を格納する変数を作成
		Scanner iJissu = new Scanner(System.in);

		//実行する処理を画面に表示
		System.out.println("三角形の面積を求めます。");

		//三角形の「底辺」の入力を促すメッセージを表示
		System.out.print("底辺:");

		//変数「dTeihen」をdouble型で作成し、キーボードから読み込んだ実数値を代入
		double dTeihen = iJissu.nextDouble();

		//三角形の「高さ」の入力を促すメッセージを表示
		System.out.print("高さ:");

		//変数「dTakasa」をdouble型で作成し、キーボードから読み込んだ実数値を代入
		double dTakasa = iJissu.nextDouble();

		//三角形の面積を表示し、改行
		System.out.println("面積は" + (dTeihen * dTakasa) / 2 + "です。");

	}	//「main」メソッドの終わり
}	//クラス「E2_6」の終わり
