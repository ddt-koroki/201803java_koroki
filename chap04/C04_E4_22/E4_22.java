package C04.E4_22;

//演習「4-22」ｎ段のピラミッドを表示するプログラム

import java.util.Scanner;

public class E4_22 {

	/**
	 * ｎ段のピラミッドを表示
	 * 最終段は「(n-1)*2+1個の*を表示させる
	 * それ以外は「(i-1)*2+1個の*を表示させる
	 */

	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner StdIn = new Scanner(System.in);

		//処理の開始を画面に表示
		System.out.println("ｎ段のピラミッドを表示します。");

		//ｎの値の入力を促すメッセージを表示
		System.out.print("ｎの値：");

		//int型で作成した変数にキーボードから入力された整数値を代入
		int Steps = StdIn.nextInt();

		/*
		 * ピラミッドの高さを制御する
		 * 入力されたｎの値以下の場合に繰り返し実行する
		 */
		for (int Length = 1; Length <= Steps; Length++) {

			/*
			 * 空白を表示させる数を変数「Space」に代入
			 * 値が0より大きい間、繰り返し空白を表示させる
			 */
			for (int Space = Steps - Length; Space > 0; Space--) {

				//空白を表示
				System.out.print(" ");
			}

			//変数「Length」と変数「Steps」が同じ場合（最終段）かどうかで処理を分岐
			if (Length == Steps) {

				//変数「SidesB」に求めた値を代入し、0より大きい場合に繰り返し実行する
				for (int SidesB = ((Steps - 1) * 2 + 1); SidesB > 0; SidesB--) {

					//*を表示させる
					System.out.print('*');

				}

			}

			//最終段以外の処理
			else {

				//変数「SidesA」に求めた値を代入し、0より大きい場合に繰り返し実行する
				for (int SidesA = ((Length - 1) * 2 + 1); SidesA > 0; SidesA--) {

					//*を表示させる
					System.out.print('*');

				}

				//一段終わるごとに改行文字を出力
				System.out.println();
			}

		}
	}
}