package C04.E4_15;

//演習「4-15」身長と標準体重の対応表を表示するプログラム

import java.util.Scanner;

public class E4_15 {

	/**
	 * 身長と標準体重の対応表を表示
	 * 身長の範囲（開始値/終了値/増分）は整数値
	 * 標準体重の求め方は（身長-100）×0.9
	 */
	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner StdIn = new Scanner(System.in);

		//身長の開始値を格納する変数「FromHeight」をint型で作成
		int FromHeight = 0;

		//身長の終了値を格納する変数「UntilHeight」をint型で作成
		int UntilHeight = 0;

		//身長の増分を格納する変数「EachHeight」をint型で作成
		int EachHeight = 0;

		//標準体重を格納する変数「StandardWeight」をdouble型で作成

		//処理の開始を視覚的に明示するために画面にメッセージを表示
		System.out.println("身長と標準体重の対応表を表示します。\n全て整数値で入力してください。");

		//誤入力防止のため、入力された値が0より大きいか判定
		do {

			//開始値の入力を促すメッセージ
			System.out.print("何cmから:");

			//キーボードから入力された整数値を変数「FromHeigh」に代入
			FromHeight = StdIn.nextInt();

			//変数「FromHeight」の値が0以下であれば繰り返す
		} while (FromHeight <= 0);

		//誤入力防止のため、入力された値が開始値より大きいか判定
		do {

			//終了値の入力を促すメッセージ
			System.out.print("何cmまで:");

			//キーボードから入力された整数値を変数「UntilHeight」に代入
			UntilHeight = StdIn.nextInt();

		//変数「UntilHeight」が変数「FromHeight」以下の場合繰り返す
		} while (UntilHeight <= FromHeight);

		//誤入力防止のため、入力された値が0より大きいか判定
		do {

			//増分の入力を促すメッセージ
			System.out.print("何cmごと:");

			//キーボードから入力された整数値を変数「EachHeight」に代入
			EachHeight = StdIn.nextInt();

			//変数「EachHeigt」の値が0以下であれば繰り返す
		} while (EachHeight <= 0);

		//対応表の項目を画面に出力
		System.out.println("身長 標準体重");

		//変数「HeightOutput」の値が「UntilHeight」より小さい間、繰り返し処理を実行する
		for (int HeightOutput = FromHeight; HeightOutput <= UntilHeight; HeightOutput += EachHeight) {

			/*
			 *計算結果によっては小数部を持つため変数「StandardWeight」をdouble型で作成
			 *公式に従い身長毎の標準体重を求め、変数「StandardWeight」に代入する
			 */
			double StandardWeight = (HeightOutput - 100) * 0.9;

			//身長、標準体重を画面に出力
			System.out.println(HeightOutput + "  " + StandardWeight);

		}

	}

}
