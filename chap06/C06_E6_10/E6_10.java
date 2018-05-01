package C06.E6_10;

import java.util.Random;
import java.util.Scanner;

//演習「6-10」演習6-9のプログラムを連続する要素が同じ値を持つことがないように改良したプログラム

public class E6_10 {

	public static void main(String[] args) {

		//キーボードから入力した値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//生成された乱数を格納する変数を作成
		Random randIn = new Random();

		//操作内容を画面に表示
		System.out.println("要素数を入力してください。");

		//要素数の入力を求めるメッセージを表示
		System.out.print("要素数:");

		//キーボードから入力された値を代入
		int eleNumber = stdIn.nextInt();

		//配列を作成
		int[] arrayInt = new int[eleNumber];

		//各要素に乱数を代入する繰り返し処理を設定
		for (int eleCount = 0; eleCount < arrayInt.length; eleCount++) {

			//要素に生成された乱数を代入
			arrayInt[eleCount] = randIn.nextInt(10) + 1;

			//変数「eleCount」が1以上の場合に実施
			if (eleCount > 0) {

				//乱数を代入した今の要素と一つ前の要素が同じ値だった場合に処理を繰り返す
				do {

					//要素に乱数を再度、代入する
					arrayInt[eleCount] = randIn.nextInt(10) + 1;

				//同じ値だった場合に繰り返し実行する
				} while (arrayInt[eleCount] == arrayInt[eleCount - 1]);
			}

			//要素に代入された値を表示
			System.out.println("a[" + eleCount + "] = " + arrayInt[eleCount]);

		}

	}

}