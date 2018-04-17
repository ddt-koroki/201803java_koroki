package chap03;		//パッケージの宣言

//演習「3-10」二つの整数値を読み込んで、差を表示するプログラム

import java.util.Scanner;	//キーボードからの読み込みを可能にする決まり文句。クラス宣言の前に書く

public class E3_10 {	//クラス「E3_10」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言
		
		//キーボードから読み込んだ整数を格納する変数を作成
		Scanner iNseisu = new Scanner(System.in);

		/*整数値Ａの入力を促すメッセージを表示
		変数「iSeisuA」をint型で作成し、キーボードから入力された整数値を代入
		*/
		System.out.print("整数値Ａ:");	int iSeisuA = iNseisu.nextInt();

		/*整数値Ｂの入力を促すメッセージを表示
		変数「iSeisuB」をint型で作成し、キーボードから入力された整数値を代入
		*/
		System.out.print("整数値Ｂ:");	int iSeisuB = iNseisu.nextInt();

		//変数「iSeisuA」と「iSeisuB」を比較して、大きい方から小さい方を引いた結果を画面に表示
		System.out.print("二つの整数値の差は" + ( iSeisuA > iSeisuB ? iSeisuA - iSeisuB : iSeisuB - iSeisuA ) + "です。");

	}	//「main」メソッドの終わり

}	//クラス「E3_10」の終わり
