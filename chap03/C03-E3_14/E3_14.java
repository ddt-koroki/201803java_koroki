package chap03;		//パッケージの宣言

//演習「3-14」二つの整数値を読み込んで、大小それぞれの値を表示するプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E3_14 {	//クラス「E3_14」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから入力された整数値を格納するための変数を作成
		Scanner iNseisu = new Scanner(System.in);

		/*整数ａの入力を促すメッセージを表示。
		変数「iSeisuA」をint型で作成し、キーボードから入力された整数値を代入
		*/
		System.out.print("整数ａ:");	int iSeisuA = iNseisu.nextInt();

		/*整数ｂの入力を促すメッセージを表示
		変数「iSeisuB」をint型で作成し、キーボードから入力された整数値を代入
		*/
		System.out.print("整数ｂ:");	int iSeisuB = iNseisu.nextInt();

		//変数「iMini」、変数「iMax」をint型で作成し、0で初期化
		int iMini = 0, iMax = 0;

		//変数「iSeisuA」と変数「iSeisuB」の比較
		if ( iSeisuA == iSeisuB )

			//比較の結果を画面に表示
			System.out.println("二つの値は同じです。");

		//同じ値ではなかった場合、どちらが大きいか判定
		else if ( iSeisuA > iSeisuB ) {

			//変数「iSeisuA」の値を変数「iMax」に代入
			iMax = iSeisuA;

			//変数「iSeisuB」の値を変数「iMini」に代入
			iMini = iSeisuB;

			//比較結果を画面に表示
			System.out.println("小さい方の値は" + iMini + "です。\n大きい方の値は" + iMax + "です。");

		}	//if文が単一の文しか制御出来ないため、複数の文をブロックで記載

			//変数「iSeisuB」が大きかった場合に実行
			else {

				//変数「iMax」、変数「iMini」それぞれに値を代入
				iMax = iSeisuB;		iMini = iSeisuA;

				//比較結果を画面に表示
				System.out.println("小さい方の値は" + iMini + "です。\n大きい方の値は" + iMax + "です。");

			}	//if文が単一の文しか制御出来ないため、複数の文をブロックで記載

	}	//「main」メソッドの終わり

}	//クラス「E3_14」の終わり
