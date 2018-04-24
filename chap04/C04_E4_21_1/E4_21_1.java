package C04.E4_21_1;

//演習「4-21」左上直角の三角形を表示するプログラム

import java.util.Scanner;

public class E4_21_1 {

	/**
	 * 左上直角の三角形を表示
	 */

	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数をint型で作成
		Scanner StdIn = new Scanner(System.in);

		//処理内容を画面に表示
		System.out.println("左上直角の三角形を表示します。");

		//段数の入力を促すメッセージを表示
		System.out.print("段数は:");

		//キーボードから入力された整数値を代入
		int Steps = StdIn.nextInt();

		//改行のタイミングを制御する
		for (int Length = Steps; Length > 0; Length--) {

			//*の横方向の数を制御する
			for (int Sides = Length; Sides > 0; Sides--) {

				//アスタリスクを出力する
				System.out.print('*');
			}

			//改行する
			System.out.println();

		}
	}

}
