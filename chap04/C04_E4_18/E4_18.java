package C04.E4_18;

//演習「4-18」1からnまでの整数値の2乗値を表示するプログラム

import java.util.Scanner;

public class E4_18 {

	/**
	 * 1からnまでの整数値の2乗値を表示するプログラム
	 * Factrial=階乗の計算用、SeisuN=ｎの値格納用、AnserF=階乗値格納用
	 * @param args
	 */

	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner StdIn = new Scanner(System.in);

		//処理内容を画面に表示し、処理の開始を視覚的に明示
		System.out.println("1からnまでの整数値の階乗を表示します。");

		//入力を促すメッセージを表示
		System.out.print("nの値:");

		/*
		 * 変数「SeisuN」をint型で作成し、キーボードから入力された整数値を代入
		 * 後続処理のFor文で終了判定に使用
		 */
		int SeisuN = StdIn.nextInt();

		/*
		 * 終了判定や２乗の計算に使用する変数「Factrial」をint型で作成し、「1」で初期化
		 * 変数「Factrial」の値が変数「SeisuN」以上になるまで繰り返し実行
		 * 繰り返し処理実行毎に変数「Factrial」をインクリメントする
		 */
		for (int Factorial = 1; Factorial <= SeisuN; Factorial++) {

			//ｎの２乗を格納するための変数「AnserF」を作成
			int AnserF = 0;

			//変数「Factrial」の２乗を変数「AnserF」に代入
			AnserF = Factorial * Factorial;

			//整数値ｎまでの整数値と２乗を画面に出力
			System.out.println(Factorial + "の２乗は" + AnserF);

		}

	}

}
