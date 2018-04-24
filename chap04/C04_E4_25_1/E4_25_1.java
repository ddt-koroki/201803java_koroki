package C04.E4_25_1;

//演習「4-25」読み込んだ整数の合計と平均を表示するプログラム(0が入力されたら終了)

import java.util.Scanner;

public class E4_25_1 {

	/**
	 * 読み込んだ整数の合計と平均を表示する
	 * 0が入力された場合、平均の分母には加算しない
	 */

	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//処理内容を画面に表示
		System.out.println("整数を加算します。");

		//整数の個数の入力を促すメッセージを表示
		System.out.print("何個加算しますか：");

		//加算する整数の個数を保持する変数をint型で作成
		int addNumber = stdIn.nextInt();

		//合計を代入する変数をint型で作成
		int sum = 0;

		//加算した整数の個数を保持する変数をdouble型で作成
		double aveCount = 0;

		//加算した整数の平均を代入する変数をdouble型で作成
		double ave = 0;

		//変数「count」が加算する個数より小さい間繰り返し実行する
		for (int count = 0; count < addNumber; count++) {

			//整数の入力を求めるメッセージを表示
			System.out.print("整数(0は加算しません。):");

			//入力された整数値を代入
			int addInt = stdIn.nextInt();

			//入力された数字が0かどうか判定
			if (addInt == 0) {

				//入力された数字が0の場合、後続の処理をスキップ
				continue;

			}

			//入力された整数値を変数「sum」に加算
			sum += addInt;

			//整数値を加算した回数をカウント
			aveCount++;

			//合計を加算した回数で割り平均を代入
			ave = (sum / aveCount);
		}

		//合計を画面に表示
		System.out.println("合計は" + sum + "です。");

		//平均を画面に表示
		System.out.println("平均は" + ave + "です。");

	}

}
