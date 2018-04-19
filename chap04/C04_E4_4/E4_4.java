package C04_E4_4;	//パッケージの宣言

//演習「4-4」List4-4のwhile文終了時にxの値が-1になることを確認するプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E4_4 {	//クラス「E4_4」の宣言

	public static void main(String[] args) {	//mainメソッドの宣言

		//キーボードから入力された整数値を格納するための変数を作成
		Scanner iStdIn = new Scanner(System.in);

		//処理内容を画面に表示
		System.out.println("カウントダウンします。");

		int iCount;	//変数「x」をint型で作成

		//変数「iCount」の値が「0」以下(負の整数)の場合、繰り返し実行
		do {

			//整数値の入力を促すメッセージを表示
			System.out.print("正の整数値：");

			//変数「iCount」にキーボードから入力された整数値を代入
			iCount = iStdIn.nextInt();

		//do文の終了判定
		}while ( iCount <= 0 );

		//変数「iCount」が「0」以上の場合、繰り返し実行
		while ( iCount >= 0 ) {

			//変数「iCount」の値を表示
			System.out.println( iCount );

			//変数「iCount」の値をデクリメント(一つ減らす)
			iCount--;

		}	//while文の終わり

			//演習問題の解答
			System.out.println("while文終了時のiCountの値を表示します。\niCountの値は" + iCount + "です。" );

	}	//mainメソッドの終わり

}	//クラス「E4_4」の終わり
