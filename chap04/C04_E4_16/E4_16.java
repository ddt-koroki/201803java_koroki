package C04.E4_16;

//演習「4-16」読み込んだ個数だけ*を表示するプログラムを書き換えて、5個表示する毎に改行するプログラムを作成

import java.util.Scanner;

public class E4_16 {

	/**
	 *キーボードから読み込んだ個数だけ*を表示させ、5個表示する毎に改行するプログラム
	 */
	public static void main(String[] args) {

		//キーボードから読み込んだ整数値を格納する変数を作成
		Scanner StdIn = new Scanner(System.in);

		//処理の開始を視覚的に明示
		System.out.print("何個*を表示しますか：");

		//変数「AstaNum」をint型で作成し、キーボードから読み込んだ整数値を代入
		int AstaNum = StdIn.nextInt();

		/*
		 * 変数「AstaOutput」の初期値を0にすると剰余が0でいきなり改行になる為、初期値は1
		 * 変数「AstaNum」より変数「AstaOutput」が小さい場合、繰り返し実行
		 */
		for (int AstaOutput = 1; AstaOutput <= AstaNum; AstaOutput++) {

			/*
			 * 改行を行うタイミングをif文で判定
			 * 変数「AstaOutput」を5で割り剰余が0であれば5回アスタリスクを出力したことになるから
			 */
			if (AstaOutput % 5 == 0) {

				//*を表示し、1行改行
				System.out.println('*');

			} else {

				//*を表示
				System.out.print('*');

			}
		}

	}

}
