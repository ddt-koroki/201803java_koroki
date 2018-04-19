package C04_E4_7;	//パッケージの宣言

//演習「4-7」読み込んだ値の個数だけ記号文字を表示するプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E4_7 {	//クラス「E4_7」の宣言

	public static void main(String[] args) {	//mainメソッドの宣言

		//キーボードから入力された整数値を格納するための変数を作成
		Scanner iStdIn = new Scanner(System.in);

		//整数値の入力を促すメッセージを表示
		System.out.print("何個表示しますか:");

		//変数「iSymN」をint型で作成し、キーボードから入力された整数値を代入
		int iSymN = iStdIn.nextInt();

		//変数「iCount」をint型で作成し、「1」で初期化
		int iCount = 1;

		//変数「iCount」が変数「iSymN」以上になるまで繰り返し実行
		while ( iCount <= iSymN ) {

			//変数「iCount」の値が偶数か判定
			if ( iCount %2 == 0)

				//変数「iCount」の値が偶数であった場合、「+」を出力
				System.out.print('+');

			//変数「iCount」の値が奇数だった場合の処理
			else
				//変数「iCount」の値が奇数であった場合、「*」を出力
				System.out.print('*');

			//変数「iCount」に対してインクリメントを実行する
			iCount++;

		}	//while文の終わり

	}	//mainメソッドの終わり

}	//クラス「E4_7」の終わり
