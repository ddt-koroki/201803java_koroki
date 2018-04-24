package C04.E4_25_2;

//演習「4-25」読み込んだ整数の合計と平均を表示するプログラム(合計が1000を超えない範囲で加算する。)

import java.util.Scanner;

public class E4_25_2 {

	/**
	 * 整数の合計と平均を表示する
	 * 合計が1000を超えた場合は加算しない
	 */

	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//処理内容を画面に表示
		System.out.println("整数を加算します。");

		//加算する個数の入力を促すメッセージを表示
		System.out.print("何個加算しますか:");

		//加算する個数を保持する変数を作成
		int addNumber = stdIn.nextInt();

		//合計値を保持する変数を作成
		int sum = 0;

		//加算した整数値の個数をカウントする変数を作成
		double aveCount = 0;

		//平均を保持する変数を作成
		double ave = 0;

		//入力回数が変数「addNumber」より小さい場合、繰り返し実行する
		for (int count = 0; count < addNumber; count++) {

			//整数の入力を求めるメッセージを出力
			System.out.print("整数：");

			//キーボードから入力された整数値を代入
			int addInt = stdIn.nextInt();

			//合計が1000を超えないか判定
			if (sum + addInt > 1000) {

				//メッセージを表示
				System.out.println("合計が1000を超えました。");

				//処理内容を表示
				System.out.println("最後の数値は無視します。");

				//後続の処理をスキップし、for文の頭に戻る
				continue;
			}

			//入力された整数値を変数「sum」に加算
			sum += addInt;

			//整数値を加算した回数をカウント
			aveCount++;

			//平均を変数「Ave」に代入
			ave = sum / aveCount;

		}

		//合計を表示
		System.out.println("合計は" + sum + "です。");

		//平均を表示
		System.out.println("平均は" + ave + "です。");

	}

}
