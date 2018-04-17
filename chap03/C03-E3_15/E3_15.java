package chap03;		//パッケージの宣言

//演習「3-15」二つの整数値を読み込んで、降順にソートするプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E3_15 {	//クラス「E3_15」の宣言

	public static void main(String[] args) {	//「main」メソッドの終わり

		//キーボードから入力された整数値を格納するための変数を作成
		Scanner iNseisu = new Scanner(System.in);

		//変数ａの入力を促すメッセージを表示
		System.out.print("整数ａ:");

		//変数「iSeisuA」をint型で作成し、キーボードから入力された整数値を代入
		int iSeisuA = iNseisu.nextInt();

		//変数ｂの入力を促すメッセージを表示
		System.out.print("整数ｂ:");

		//変数「iSeisuB」をint型で作成し、キーボードから入力された整数値を代入
		int iSeisuB = iNseisu.nextInt();

		//変数「iSeisuA」と変数「iSeisuB」の比較
		if ( iSeisuB > iSeisuA ) {

			/*
				ソートを行うため変数「iKari」をint型で作成
				上書を回避するため、変数「iSeisuA」を代入
			*/
			int iKari = iSeisuA;

			//変数「iSeisuA」に変数「iSeisuB」を代入
			iSeisuA = iSeisuB;

			//変数「iSeisuB」に変数「iKari」を代入
			iSeisuB = iKari;

		}	//if文が単一の文しか制御出来ないため、複数の文をブロックで記載

	//実行内容を画面に表示
	System.out.println("入力された整数値を降順にソートして表示します。");

	//実行結果を画面に表示
	System.out.println("整数ａは" + iSeisuA + "です。\n整数ｂは" + iSeisuB + "です。");

	}	//「main」メソッドの終わり

}	//クラス「E3-15」の終わり
