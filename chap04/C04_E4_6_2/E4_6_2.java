package C04_E4_6_2;		//パッケージの宣言

/*
	演習「4-6」List4-7のプログラムを読み込んだ値が1未満であれば
	改行文字を出力しないプログラムとして再作成
*/

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E4_6_2 {	//クラス「E4_6_2」の宣言

	public static void main(String[] args) {	//mainメソッドの宣言

		//キーボードから入力された整数値を格納するための変数を作成
		Scanner iStdIn = new Scanner(System.in);

		//表示させるアスタリスクの数を入力するよう促すメッセージを表示
		System.out.print("何個*表示しますか：");

		//変数「iPutAstN」をint型で作成し、キーボードから入力された整数値を代入
		int iPutAstN = iStdIn.nextInt();

		//while文の終了判定に使用する変数「iCount」をint型で作成し、「1」で初期化
		int iCount	= 1;

		/*
			while文の終了判定
			変数「iCount」の値が、変数「iPutAst」より小さい場合、繰り返し実行
		*/
		while ( iCount <= iPutAstN ) {

			//アスタリスクを画面に表示
			System.out.print('*');

			//変数「iCount」の値に対してインクリンメントを行う
			iCount++;

		}	//while文の終わり

		//改行文字の出力判定
		if ( iPutAstN > 0 )

			//改行文字を出力
			System.out.println();

	}	//mainメソッドの終わり

}	//クラス「E4_6_2」の終わり
