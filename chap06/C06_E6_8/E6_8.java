package C06.E6_8;

//演習「6-8」double型の配列の全要素の合計と平均値を求めるプログラム

import java.util.Scanner;

public class E6_8 {

	/**
	 * double型配列の全要素の合計と平均値を求める
	 * 要素数と全要素の値はキーボードから読み込む
	 */
	public static void main(String[] args) {

		//キーボードから読み込んだ値を格納する変数を作成
		Scanner std = new Scanner(System.in);

		//操作内容を画面に出力
		System.out.println("要素数を入力してください。");

		//要素数の入力を求めるメッセージを表示
		System.out.print("要素数:");

		//キーボードから読み込んだ値を代入
		int eleNumber = std.nextInt();

		//double型の数値を格納する配列を作成
		double[] arrayDbl = new double[eleNumber];

		//キーボードから実数値を読み込む繰り返し処理を実行
		for (int eleCount = 0; eleCount < eleNumber; eleCount++) {

			//操作内容を画面に出力
			System.out.println("配列に格納する実数を入力してください。");

			//実数値の入力を求めるメッセージを表示
			System.out.print("実数値:");

			//要素に入力された実数値を代入
			arrayDbl[eleCount] = std.nextDouble();

		}

		//合計値を代入する変数を作成
		double sumDbl = 0;

		//配列「arrayDbl」の全要素を走査
		for (double elePoint : arrayDbl) {

			//変数「sumDbl」に各要素の値を足す
			sumDbl += elePoint;

		}

		//全要素の合計を画面に表示
		System.out.println("全要素の和は" + sumDbl + "です。");

		//全要素の平均を求め、結果を画面に表示
		System.out.println("全要素の平均は" + (sumDbl / eleNumber) + "です。");

	}

}
