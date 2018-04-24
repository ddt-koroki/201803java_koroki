package C04.E4_23;

//演習「4_23」ｎ段の数字ピラミッドを表示するプログラムを作成

import java.util.Scanner;

public class E4_23 {

	/**
	 * ｎ段の数字ピラミッドを表示する
	 * 表示する数字は「i % 10」で求めた数字（剰余）
	 */
	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//段数を保持する変数をint型で作成し、0で初期化
		int steps = 0;

		//誤入力防止のdo文
		do {

			//処理内容を画面に表示
			System.out.println("ｎ段の数字ピラミッドを表示します。");

			//ｎの値の入力を促すメッセージを表示
			System.out.print("ｎの値：");

			//キーボードから入力された整数値を代入
			steps = stdIn.nextInt();

		//変数「steps」が1より小さい場合は再入力させる
		} while (steps < 1);

		//入力された整数値(段数)になるまで繰り返し実行する
		for (int length = 1; length <= steps; length++) {

			//最終段数から現在の段数を引いた残りを空白文字として出力する
			for (int space = steps - length; space > 0; space--) {

				//空白を表示
				System.out.print(" ");
			}

			//計算で求めた値を変数「sides」に代入し、0より大きい場合は繰り返し実行する
			for (int sides = ((length - 1) * 2 + 1); sides > 0; sides--) {

				//現在の段数を10で割り剰余を表示させる
				System.out.print(length % 10);

			}

			//一段終わるごとに改行文字を出力
			System.out.println();
		}

	}

}
