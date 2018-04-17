package chap03;		//パッケージの宣言

//演習「3-4」二つの変数aとbを読み込んで大小関係を表示するプログラム

import java.util.Scanner;	//キーボードからの読み込みを可能にする決まり文句。クラス宣言の前に書く

public class E3_4 {	//クラス「3_4」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから読み込んだ実数を格納する変数を作成
		Scanner iNjissu = new Scanner(System.in);

		//ａの値の入力を促すメッセージを表示
		System.out.print("aの値:");

		//変数「dHikakuA」をdouble型で作成し、キーボードから読み込んだ実数を代入
		double dHikakuA = iNjissu.nextDouble();

		//ｂの値の入力を促すメッセージを表示
		System.out.print("bの値:");

		//変数「dHikakuB」をdouble型で作成し、キーボードから読み込んだ実数を代入
		double dHikakuB = iNjissu.nextDouble();

		//変数「dHikakuA」と変数「dHikakuB」が等しくないか判定
		if ( dHikakuA != dHikakuB )

			//変数「dHikakuA」が変数「dHikakuB」より大きいか判定
			if ( dHikakuA > dHikakuB )

				//変数「dHikakuA」が大きい場合、aの方が大きい旨、画面にメッセージを表示
				System.out.println("aの方が大きいです。");

			//変数「dHikakuB」が大きい場合、bの方が大きい旨、画面にメッセージを表示
			else
				System.out.println("bの方が大きいです。");

		//変数「dHikakuA」と「dHikakuB」が等しい場合、同じ値である旨、画面にメッセージを表示
		else
			System.out.println("aとbは同じ値です。");

	}	//「main」メソッドの終わり

}	//クラス「E3_4」の終わり
