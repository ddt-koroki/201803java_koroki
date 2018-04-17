package chap02; //パッケージの宣言

//演習「2-3」キーボードから入力された整数値を反復して表示するプログラム

import java.util.Scanner;		//キーボードからの読み込みを可能にする決まり文句。プログラムの先頭に書く。

public class E2_3 {	//クラス「E2_3」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//「main」メソッドの先頭に書く。キーボードから読み込んだ整数を格納する変数を作成
		Scanner iSeisu = new Scanner(System.in);


		//整数値の入力を促すメッセージを表示
		System.out.print("整数値：");

		//変数「iHyoji」をint型で作成し、キーボードから読み込んだ整数値で初期化
		int iHyoji = iSeisu.nextInt();

		//キーボードから読み込んだ整数を画面に表示
		System.out.println(iHyoji + "と入力しましたね。");

	}	//「main」メソッドの終わり
}	//クラス「E2_3」の終わり
