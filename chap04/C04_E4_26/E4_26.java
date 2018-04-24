package C04.E4_26;

//演習「4-26」読み込んだ整数の合計と平均を表示するプログラム（負の値は加算しない)

import java.util.Scanner;

public class E4_26 {

	/**
	 * 整数の合計と平均を表示する
	 * 負の値は除く
	 */
	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//処理内容を表示
		System.out.println("整数を加算します。");

		//入力を促すメッセージを表示
		System.out.print("何個加算しますか：");

		//キーボードから入力された整数を加算する個数を代入
		int addNumber = stdIn.nextInt();

		//合計を保持する変数を作成
		int sum = 0;

		//平均を保持する変数を作成
		double ave = 0;

		//整数を加算した回数をカウントする変数を作成
		double addCount = 0;

		//入力回数が加算する整数の個数より小さい間、繰り返し実行する
		for (int count = 0; count < addNumber; count++) {

			//整数の入力を促すメッセージを表示
			System.out.print("整数：");

			//キーボードから入力された整数値を代入
			int addInt = stdIn.nextInt();

			//入力された整数値が負の数か判定
			if (addInt < 0) {

				//処理内容を画面に表示
				System.out.println("負の数は加算しません。");

				//後続の処理をスキップし、for文の頭に戻る
				continue;

			}

			//入力された整数値を加算
			sum += addInt;

			//整数値を加算した回数をカウント
			addCount++;

			//求めた平均を変数「ave」に代入
			ave = sum / addCount;

		}

		//合計を表示
		System.out.println("合計は" + sum + "です。");

		//平均を表示
		System.out.println("平均は" + ave + "です。");

	}

}
