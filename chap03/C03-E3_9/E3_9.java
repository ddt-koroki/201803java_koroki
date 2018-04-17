package chap03;		//パッケージの宣言

//演習「3-9」二つの実数値を読み込んで、大きい方を表示するプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言前に書く

public class E3_9 {	//クラス「E3_9」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから読み込んだ実数を格納する変数を作成
		Scanner dNjissu = new Scanner(System.in);

		//実数入力を促すメッセージを表示し、変数「dJissuA」をdouble型で作成。
		System.out.print("実数ａ:");	double dJissuA = dNjissu.nextDouble();

		//実数入力を促すメッセージを表示し、変数「dJissuB」をdouble型で作成。
		System.out.print("実数ｂ:");	double dJissuB= dNjissu.nextDouble();

		//大きい値を判定し、画面に結果を表示
		System.out.println("大きい方の値は" + ( dJissuA > dJissuB ? dJissuA : dJissuB ) + "です。");

	}	//「main」メソッドの終わり

}	//クラス「E3_9」の終わり
