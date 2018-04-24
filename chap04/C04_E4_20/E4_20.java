package C04.E4_20;

//演習「4-20」ｎ段の正方形を表示するプログラム

import java.util.Scanner;

public class E4_20 {

	/**
	 *ｎ段の正方形を表示するプログラム
	 */

	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner StdIn = new Scanner(System.in);

		//処理内容及び処理開始を視覚的に明示
		System.out.println("ｎ段の正方形を表示します。");

		//入力を促すメッセージを表示
		System.out.print("ｎの値:");

		//段の情報を保持する変数をint型で作成
		int Square = StdIn.nextInt();

		/*
		 * 正方形の縦の*をいくつ出力するか判定する文
		 * 変数「Length」が変数「Square」以下の場合に繰り返し実行する
		 */
		for (int Length = 1; Length <= Square; Length++) {

			/*
			 * 正方形の横の*をいくつ出力するか判定する文
			 * 変数「Side」が変数「Square」以下の場合に繰り返し実行する
			 */
			for (int Side = 1; Side <= Square; Side++) {

				//*を画面に表示
				System.out.print('*');

			}

			//ｎ個の*が表示されたら改行
			System.out.println();

		}

	}
}
