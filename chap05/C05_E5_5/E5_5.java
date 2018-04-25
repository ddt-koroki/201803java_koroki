package C05.E5_5;

//演習「5-5」三つの整数値を読み込んで、合計と平均を表示するプログラム

import java.util.Scanner;

public class E5_5 {

	/**
	 * 三つの整数値を読み込んで、合計と平均を表示する
	 * 平均はキャスト演算子を利用して求め、実数として表示
	 */
	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//処理内容を画面に表示
		System.out.println("3つの整数値の合計と平均を表示します。");

		//整数ｘの入力を促すメッセージを表示
		System.out.print("整数ｘ:");

		//キーボードから入力された整数値を代入
		int seisuX = stdIn.nextInt();

		//整数ｙの入力を促すメッセージを表示
		System.out.print("整数ｙ:");

		//キーボードから入力された整数値を代入
		int seisuY = stdIn.nextInt();

		//整数ｚの入力を促すメッセージを表示
		System.out.print("整数ｚ:");

		//キーボードから入力された整数値を代入
		int seisuZ = stdIn.nextInt();

		//3つの数字の合計を変数「sum」に代入
		int sum = (seisuX + seisuY + seisuZ);

		//浮動小数点を表示させるため、キャストを使用してint型である変数「sum」を除算
		double ave = (double)sum / 3;

		//3つの整数の合計を表示
		System.out.println("3つの整数の合計は" + sum + "です。");

		//3つの整数の平均を表示
		System.out.println("3つの整数の平均は" + ave + "です。");

	}

}
