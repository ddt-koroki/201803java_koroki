package C04.E4_24;

//演習「4-24」正の整数値を読み込み、素数であるかどうか判定するプログラム

import java.util.Scanner;

public class E4_24 {

	/**
	 * 読み込んだ整数が素数か判定するプログラム
	 */

	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//キーボードから入力された整数値を保持する変数をint型で作成
		int seisu = 0;

		//素数の判定に使用する変数をint型で作成
		int primeCount = 0;

		//誤入力を防止するため、do文を使用
		do {

			//処理内容を画面に表示
			System.out.println("入力された正の整数値ｎが素数であるか判定します。");

			//ｎの値の入力を促すメッセージを表示
			System.out.print("ｎの値：");

			//キーボードから入力された整数値を代入
			seisu = stdIn.nextInt();

		//1より小さい整数値が入力された場合、再入力させる
		} while (seisu < 1);

		/*
		 * 変数「divisionNumber」が変数「seisu」の値以下の場合、繰り返し実行する
		 * 変数「divisionNumber」は割る数
		 */

		for (int divisionNumber = 1; divisionNumber <= seisu; divisionNumber++) {

			//剰余が「0」(約数)を判定する
			if (0 == (seisu % divisionNumber)) {

				//約数の数をカウント
				primeCount++;

				/*
				 * 変数「primeCount」(約数の数)が2より大きいか判定
				 */
				if (primeCount > 2) {

					//2より大きい場合、素数ではないため処理を抜ける
					break;
				}

			}

		}

		//入力された整数が1かどうか判定
		if (seisu == 1) {

			//1は素数ではないため、その旨画面にメッセージを表示
			System.out.println("入力された整数値" + seisu + "は素数ではありません。");
		}

		//変数「praimCount」が2より大きいか判定
		else if (primeCount > 2) {

			//約数が3つ以上存在し、素数ではないため、その旨画面にメッセージを表示
			System.out.println("入力された整数値" + seisu + "は素数ではありません。");

		}

		//上記以外の場合、素数と判定する
		else {

			//画面にメッセージを表示
			System.out.println("入力された整数値" + seisu + "は素数です。");
		}
	}
}
