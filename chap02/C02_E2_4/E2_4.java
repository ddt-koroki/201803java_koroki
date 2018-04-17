package chap02;		//パッケージの宣言

//演習「2-4」キーボードから入力された整数値に10を加減算した結果を表示

import java.util.Scanner;	//キーボードからの読み込みを可能にする決まり文句。プログラムの先頭に書く。

public class E2_4 {	//クラス「E2-4」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから読み込んだ整数を格納する変数を作成
		Scanner iSeisu = new Scanner(System.in);


		//整数値の入力を促すメッセージを画面に表示
		System.out.print("整数値:" );

		//変数「x」をint型で作成し、キーボードから読み込んだ整数を代入
		int iAtai = iSeisu.nextInt();

		//キーボードから読み込んだ整数に10を加算した結果を表示し、改行
		System.out.println("10を加えた値は" + (iAtai + 10) + "です。");

		//キーボードから読み込んだ整数から10を減算した結果を表示し、改行
		System.out.println("10を減じた値は" + (iAtai - 10) + "です。");

	}	//「main」メソッドの終わり
}	//クラス「E2_4」の終わり
