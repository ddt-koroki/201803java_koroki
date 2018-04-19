package C04_E4_10;	//パッケージの宣言

//演習「4_10」読み込んだ値が1未満であれば改行文字を出力しないようにList4-11を書き換えたプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E4_10 {	//クラス「E4_10」宣言

	public static void main(String[] args) {	//mainメソッドの宣言

		//キーボードから入力された整数値を格納する変数を作成
		Scanner iStdIn = new Scanner(System.in);

		//整数値の入力を促すメッセージを表示
		System.out.print("何個*を表示しますか。");

		//変数「iPutAstN」をint型で作成し、キーボードから入力された整数値を代入
		int iPutAstN = iStdIn.nextInt();

		//入力された整数値に従って「*」を表示するfor文
		for (int iCount = 0; iCount < iPutAstN; iCount++ )
			System.out.print('*');

		//入力された整数値が「1」以上だった場合、改行文字を出力する
		if ( iPutAstN >= 1 )
			System.out.println();

	}

}
