package C04.E4_14;

//演習「4-14」4-13のプログラムを式を表示するよう作成

import java.util.Scanner;

public class E4_14 {

	/**
	 * 1～nまでの和を求め、その式を表示するプログラム
	 */

	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner iStdIn = new Scanner(System.in);

		/*
		 * 変数「iSeisu」をint型で作成
		 * for文の終了判定に使用
		 */
		int iSeisu;

		/*
		 * 誤入力を防止するため、do文を使用して整数値の入力を実行
		 */
		do {

			//処理の開始を視覚的に分かり易くするため、処理内容を画面に表示
			System.out.print("1からnまでの和を求めます。\nnの値を入力してください。");

			//キーボードから入力された整数値を代入
			iSeisu = iStdIn.nextInt();

			//入力された整数値が正の整数であればdo文を終了する
		} while (iSeisu <= 0);

		//和を格納する変数「sum」をint型で作成し、0で初期化
		int iSum = 0;

		/*
		 * 変数「iCount」が変数「iSeisu」以下の間繰り返し処理を実行する
		 * 変数「sum」に変数「iCount」の値を足した後、インクリメントされる為、1で初期化
		 */
		for (int iCount = 1; iCount <= iSeisu; iCount++)

			//変数「iCount」が変数「iSeisu」より小さい場合の処理
			if (iCount < iSeisu) {

				/*
				 * 式の表現のため、変数「iCount」の値と「+」を画面に表示
				 * 式と答えを一行で出力させるため、改行はしない
				 */

				System.out.print(iCount + "+");

				//変数「iSum」に変数「iCount」を加算
				iSum += iCount;

			} else {

				//変数「iCount」の値と「=」を表示して式の終了
				System.out.print(iCount + "=");

				//変数「iSum」に変数「iCount」を加算
				iSum += iCount;
			}

		//式に続けて、nまでの数字の和を表示
		System.out.println(iSum);

	}

}
