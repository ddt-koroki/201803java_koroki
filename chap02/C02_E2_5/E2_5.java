package chap02;		//パッケージの宣言

//演習「2-5」2つの実数値の和と平均を表示

import java.util.Scanner;	//キーボードからの読み込みを可能にする決まり文句。プログラムの先頭に書く

public class E2_5 {	//クラス「E2_5」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから読み込んだ実数値を格納する変数を作成
		Scanner iSeisu = new Scanner(System.in);

		//xの値の入力を促すメッセージを表示
		System.out.print("xの値:");

		//変数「dX」をdouble型で作成し、キーボードから読み込んだ実数値を代入
		double dX = iSeisu.nextDouble();

		//yの値の入力を促すメッセージを表示
		System.out.print("yの値:");

		//変数「dY」をdouble型で作成、キーボードから読み込んだ実数値を代入
		double dY = iSeisu.nextDouble();

		//変数「dX」と変数「dY」の合計を表示し、改行
		System.out.println("合計は" + (dX + dY) + "です。");

		//変数「dX」と変数「dY」の平均を表示し、改行
		System.out.println("平均は" + (dX + dY) / 2 + "です。");

	}	//「main」メソッドの終わり
}	//クラス「E2_5」の終わり