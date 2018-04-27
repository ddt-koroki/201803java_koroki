package C06.E6_7;

//演習「6-7」線形探索で配列の最後尾から要素を見つけるプログラム

import java.util.Scanner;
import java.util.Random;

public class E6_7 {

	/**
	 * 線形探索を配列の最後尾から実行する
	 * 各要素の値は生成される乱数を代入する
	 */
	public static void main(String[] args) {

		//生成された乱数を格納する変数を作成
		Random randIn = new Random();

		//キーボードから入力された整数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//要素数をfinal変数を使用して指定
		final int eleNumber = 12;

		//乱数を代入する要素を作成
		int[] arrayA = new int[eleNumber];

		//生成された乱数を要素に代入する繰り返し処理を設定
		for (int eleCount = 0; eleCount < eleNumber; eleCount++) {

			//生成された乱数を要素に代入
			arrayA[eleCount] = randIn.nextInt(10);

		}

		//処理内容を画面に表示
		System.out.print("配列ａの全要素の値\n{");

		//要素に格納されている値を表示する繰り返し処理を設定
		for (int eleCount = 0; eleCount < eleNumber; eleCount++) {

			//要素に格納されている値を画面に表示
			System.out.print(arrayA[eleCount] + " ");

		}

		//画面に表示するデータの末尾を出力
		System.out.println("}");

		//探索する値をキーボードから入力
		System.out.print("探す数値:");

		//キーボードから入力された探索する値を代入
		int keyValue = stdIn.nextInt();

		//探索の成功・失敗判定と要素の値を出力する際に使用する変数を作成
		int serchArray;

		//入力された値を線形探索する繰り返し処理を設定
		for (serchArray = eleNumber - 1; serchArray >= 0 && arrayA[serchArray] != keyValue; serchArray--) {

			//各繰り返し処理の実行のため、本文は空分
			;

		}

		//線形探索の成功・失敗を判定
		if (serchArray >= 0) {

			//探索した値が格納されているインデックスを表示
			System.out.println("それはa[" + serchArray + "]にあります。");
		}

		//線形探索失敗時の処理
		else
			//処理結果を画面に出力
			System.out.println("それはありません。");

	}

}