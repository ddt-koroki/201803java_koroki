package C04.E4_17;

//演習「4-17」読み込んだ整数値の約数を全て表示し、最後に約数の個数を表示するプログラム

import java.util.Scanner;

public class E4_17 {

	/**
	 * キーボードから入力された整数値の約数を全て表示し、最後に約数の個数を表示するプログラム
	 *
	 * SeisuA=割られる数、SeisuB=割る数、Count=約数の個数
	 */
	public static void main(String[] args) {

		//キーボードから読み込んだ整数値を格納する変数を作成
		Scanner StdIn = new Scanner(System.in);

		//処理の開始を視覚的に明示
		System.out.print("入力した整数の約数を表示します。\n整数値:");

		//変数「SeisuA」をint型で作成し、キーボードから読み込んだ整数値を代入
		int SeisuA = StdIn.nextInt();

		//約数の個数をカウントする変数「Count」をint型で作成
		int Count = 0;

		/*
		 * 変数「SeisuB」をint型で作成し、0で割れる数はないため、「1」で初期化
		 * 約数を求めるプログラムのため、変数「SeisuB」が変数「SeisuA」と同じ値になったら終了するよう設定
		 * 全ての約数を調べるため、繰り返す度に変数「SeisuB」をインクリメントする
		 */
		for (int SeisuB = 1; SeisuB <= SeisuA; SeisuB++) {

			//剰余が「0」の時に実行されるif文を設定
			if (SeisuA % SeisuB == 0) {

				//剰余が「0」になる割る数が約数であるため、画面に変数「SeisuB」の値を出力
				System.out.println(SeisuB);

				//約数の個数を出力させるため、変数「Count」をインクリメントする
				Count++;

			}

		}

		//約数の個数をカウントしていた変数「Count」を画面に表示
		System.out.println("約数は" + Count + "個です。");

	}

}
