package chap03;		//パッケージの宣言

//演習「3-1」整数値をキーボードから読み込んで絶対値を表示するプログラム

import java.util.Scanner;	//キーボードからの読み込みを可能にする決まり文句。

public class E3_1 {	//クラス「E3_1」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから読み込んだ整数を格納する変数を作成
		Scanner iNseisu = new Scanner(System.in);

		//整数値の入力を促すメッセージを表示
		System.out.print("整数値:");

		//変数「iSeisu」をint型で作成し、キーボードから読み込んだ整数を代入
		int iSeisu = iNseisu.nextInt();

		//入力された整数が0以上の整数か判定
		if (iSeisu >= 0)

			//入力された整数値が0以上の整数であった場合、そのまま絶対値を画面に表示
			System.out.println("その絶対値は" + iSeisu + "です。");

		//入力された整数が0より小さかった場合、符号を反転して絶対値を画面に表示
		else
			System.out.println("その絶対値は" + -iSeisu + "です。");
	}	//「main」メソッドの終わり

}	//クラス「E3_1」の終わり
