package C04.E4_13;

//演習「4-13」1からnまでの和を求めるList4-10をfor文で作成

import java.util.Scanner;

public class E4_13 {

	/**
	 * 1からnまでの和を求めるプログラム
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
			System.out.print("1からnまでの和を求めます。\n数字を入力してください。");

			//キーボードから入力された整数値を代入
			iSeisu = iStdIn.nextInt();

			//入力された整数値が正の整数であればdo文を終了する
		} while (iSeisu <= 0);

		//和を格納する変数「sum」をint型で作成し、0で初期化
		int sum = 0;

		/*
		 * 変数「iCount」が変数「iSeisu」以下の間繰り返し処理を実行する
		 * 変数「sum」に変数「iCount」の値を足した後、インクリメントされる為、1で初期化
		 */
		for (int iCount = 1; iCount <= iSeisu; iCount++)

			//変数「iCount」を変数「sum」に繰り返し足す処理のため、複合代入演算子を使用
			sum += iCount;

		//実行結果を画面に表示
		System.out.println("1から" + iSeisu + "までの和は" + sum + "です。");

	}

}
