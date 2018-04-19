package C04.E4_12;

//演習「4-12」0から正の整数値までカウントアップするプログラム

import java.util.Scanner;

public class E4_12 {

	/**
	 * 0からキーボードで入力された値までカウントアップを行うプログラム
	 */
	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner iStdIn = new Scanner(System.in);

		/*
			処理内容を画面に表示
			プログラムが実行されたか視覚的にわかる
		*/
		System.out.println("カウントアップします。");

		/*
		 * キーボードから入力された整数値を保持する変数を作成
		 * do文、for文内で終了判定に使用する
		 */
		int iSeisu;

		/*
		 * 正しい整数値が入力されるまで繰り返し実行
		 * 誤入力を防止するため、do文で実行
		 */

		do {

			//正の整数値の入力を促すメッセージを表示
			System.out.print("正の整数値:");

			//キーボードから入力された整数値を変数「iSeisu」に代入
			iSeisu = iStdIn.nextInt();

			/*
			 * do文の終了判定
			 * 変数「iSeisu」の値が正の整数か判定
			 */

		} while (iSeisu < 0);

		/*
		 * 入力された正の整数値までカウントアップを行う処理
		 * 冗長にならないようfor文を使用
		 */
		for (int iCup = 0; iCup <= iSeisu; iCup++)

			//変数「iCup」の値を画面に表示
			System.out.println(iCup);
	}

}
