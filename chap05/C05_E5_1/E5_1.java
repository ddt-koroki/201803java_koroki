package C05.E5_1;

//演習「5-1」10進整数を読み込んで、その値を8進数と16進数で表示するプログラム

import java.util.Scanner;

public class E5_1 {

	/**
	 * 10進整数を8進数と16進数で表示
	 */
	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//処理内容を画面に表示
		System.out.println("入力された整数を8進数と16進数で表示します。");

		//整数値の入力を促すメッセージを表示
		System.out.print("整数：");

		//キーボードから入力された整数値を代入
		int decimalInt = stdIn.nextInt();

		//変数「decimalInt」に代入した値を8進数に変換し、画面へ出力
		System.out.printf("8進数では%oです。\n", decimalInt);

		//変数「decimalInt」に代入した値を16進数に変換し、画面へ出力
		System.out.printf("16進数では%xです。\n", decimalInt);

	}

}
