package chap04;		//パッケージの宣言

//演習「4-1」キーボードから読み込んだ整数値の符号を判定するプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E4_1 {	//クラス「E4_1」の宣言

	public static void main(String[] args) {	//mainメソッドの宣言

		//キーボードから入力された変数を格納するための変数を作成
		Scanner iSeisu = new Scanner(System.in);

		//do文の終了判定に使用する変数「retry」をint型で作成
		int iRetry;

		//変数「iRetry」の値が「1」になるまで繰り返し実行
		do {

			//整数値の入力を促すメッセージを表示
			System.out.print("整数値:");

			//変数「iSeisuN」をint型で作成し、キーボードから入力された整数を代入
			int iSeisuN = iSeisu.nextInt();

			//変数「iSeisuN」に代入された値の符号が「正」か判定
			if ( iSeisuN > 0 )

				//判定結果を画面に表示
				System.out.println("その値は正です。");

			//変数「iSeisuN」に代入された値の符号が「負」か判定
			else if ( iSeisuN < 0 )

				//判定結果を画面に表示
				System.out.println("その値は負です。");

			//変数「iSeisuN」の値が「0」の場合に実行
			else

				//判定結果を画面に表示
				System.out.println("その値は0です。");

			//再実行を行うかの確認メッセージと値の入力を促すメッセージを表示
			System.out.print("もう一度？ 1…Yes／0…No:");

			//キーボードから入力された整数を代入
			iRetry = iSeisu.nextInt();

		//do文の終了判定。変数「iRetry」の値を判定
		}while ( iRetry == 1 );

	}	//mainメソッドの終わり

}	//クラス「E4-1」の終わり
