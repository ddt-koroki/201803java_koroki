package C04.E4_21_2;

//演習「4-21」右下直角の三角形を表示するプログラム

import java.util.Scanner;

public class E4_21_2 {

	/**
	 * 右下直角の三角形を表示する
	 */

	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner StdIn = new Scanner(System.in);

		//処理内容を画面に表示
		System.out.println("右下直角の三角形を表示します。");

		//段数の入力を促すメッセージを表示
		System.out.print("段数は:");

		//キーボードから入力された整数値を代入
		int Steps = StdIn.nextInt();

		//三角形の縦の長さを制御する
		for (int Length = Steps; Length > 0; Length--) {

			// *を表示しない空白の部分を制御する
			for (int Space = Length; Space > 0; Space--) {

				//空白を表示
				System.out.print(" ");

			}

			//横に*を表示させる数を制御する
			for (int Sides = Steps - Length; Sides >= 0; Sides--) {

				//*を表示
				System.out.print('*');

			}

			//一段終わるごとに改行
			System.out.println();

		}
	}

}
