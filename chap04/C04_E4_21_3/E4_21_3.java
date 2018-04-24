package C04.E4_21_3;

//演習「4-21」右上直角の三角形を表示するプログラム

import java.util.Scanner;

public class E4_21_3 {

	/**
	 * 右上直角の三角形を表示
	 */

	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner StdIn = new Scanner(System.in);

		//処理内容を画面に表示
		System.out.println("右上直角の三角形を表示します。");

		//段数の入力を促すメッセージを表示
		System.out.print("段数は:");

		//キーボードから入力された整数値を代入
		int Steps = StdIn.nextInt();

		//三角形の縦の長さを制御する
		for (int Length = Steps; Length > 0; Length--) {

			//空白を表示させる回数を求め、0より大きい間繰り返し実行する
			for (int Space = Steps - Length; Space > 0; Space--) {

				//空白を表示
				System.out.print(" ");

			}

			//*を表示させる数を変数「Length」の値で代入
			for (int Sides = Length; Sides > 0; Sides--) {

				//*を表示
				System.out.print('*');

			}

			//一段終わるごとに改行
			System.out.println();

		}

	}

}
