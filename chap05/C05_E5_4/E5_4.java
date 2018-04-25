package C05.E5_4;

//演習「5-4」三つの整数値を読み込んで、その合計と平均を表示するプログラム

import java.util.Scanner;

public class E5_4 {

	/**
	 * 三つの整数値を読み込んで、その合計と平均を表示する
	 * 平均は実数として表示する
	 */
	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//処理内容を画面に表示
		System.out.println("整数ｘ、整数ｙ、整数ｚの合計と平均を求めます。");

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

		//3つの整数の合計値を変数「sum」に代入
		int sum = (seisuX + seisuY + seisuZ);

		//浮動小数点を表示させるため、int型の変数「sum」を小数部をもつ値で除算
		double ave = (sum / 3.0);

		//3つの数字の合計を表示
		System.out.println("3つの整数の合計は" + sum + "です。");

		//3つの数字の平均を表示
		System.out.println("3つ整数の平均は" + ave + "です。");

	}

}
