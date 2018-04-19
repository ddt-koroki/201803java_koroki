package C04_E4_5;	//パッケージの宣言

//演習「4-5」List4-5の「x--」が「--x」となっていた場合の出力結果の検討

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E4_5 {	//クラス「E4_5」の宣言

	public static void main(String[] args) {	//mainメソッドの終わり

		//キーボードから入力された整数値を格納するための変数を作成
		Scanner iStdIn = new Scanner(System.in);

		//処理内容を画面に表示
		System.out.println("カウントダウンします。");

		int iCount;	//変数「iCount」をint型で作成

		//変数「iCount」が「0」以下の場合、繰り返し実行
		do {

			//正の整数値の入力を促すメッセージを表示
			System.out.print("正の整数値:");

			//キーボードから入力された整数値を代入
			iCount = iStdIn.nextInt();

		}while ( iCount <= 0 );	//while文の終わり

	//変数「iCount」が「0」より大きい場合繰り返し実行
	while ( iCount >= 0)

		//デクリメント後に変数「iCount」の値を表示
		System.out.println(--iCount);

	}	//mainメソッドの終わり

}	//クラス「E4_5」の終わり


/*
	カウントダウンします。
	正の整数値:10
	9
	8
	7
	6
	5
	4
	3
	2
	1
	0
	-1

	「x--」から「--x」に変更した場合、上記のような出力結果が得られる。
	変数「x」をデクリメント後に画面への表示と終了判定を行っているため、
	「x--」とは異なり変数「x」の値が「-1」の場合でも画面に値が表示される。

*/