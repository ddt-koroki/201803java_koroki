package C04.E4_19;

//演習「4-19」1～12以外の数字が入力された場合に再入力させるように修正

import java.util.Scanner;

public class E4_19 {

	/**
	 * 1～12までの数字を入力させ、対応した季節を表示させるプログラム
	 * @param args
	 */

	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner StdIn = new Scanner(System.in);

		//do文の終了判定に使用する変数をint型で作成
		int Retry;

		//キーボードから入力された整数値を格納する変数をint型で作成
		int Month;

		//繰り返し処理判定に使用する
		do {

			//誤入力防止のために使用する
			do {

				//処理の開始を視覚的に明示
				System.out.print("季節を求めます。\n何月ですか:");

				//入力された整数値を変数「Month」に代入
				Month = StdIn.nextInt();

				//変数「Month」の値が3～5の間か判定
				if (Month >= 3 && Month <= 5) {

					//対応するメッセージを表示
					System.out.println("それは春です。");

				}

				//変数「Month」の値が3～5の間でなかった場合に、6～8の間か判定
				else if (Month >= 6 && Month <= 8) {

					//対応するメッセージを表示
					System.out.println("それは夏です。");

				//変数「Month」の値が3～8の間でなかった場合に、9～11の間か判定
				} else if (Month >= 9 && Month <= 11) {

					//対応するメッセージを表示
					System.out.println("それは秋です。");
				}

				//変数「Month」の値が3～11の間でなかった場合に、12、1、2何れかか判定
				else if (Month == 12 || Month == 1 || Month == 2) {

					//対応するメッセージを表示
					System.out.println("それは冬です。");

				}

			//入力された値が1～12でなかった場合に入力から繰り返し実行する
			} while (1 > Month || Month >= 13);

			//繰り返し処理の確認
			System.out.print("もう一度? 1…Yes/0…No:");

			//キーボードから入力された整数値を代入
			Retry = StdIn.nextInt();

		//変数「Retry」の値が1だった場合に再度実行する
		} while (Retry == 1);

	}

}
