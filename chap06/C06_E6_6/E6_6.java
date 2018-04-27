package C06.E6_6;

//演習「6-6」テストの点数の合計点・平均点・最高点・最低点を表示するプログラム

import java.util.Scanner;

public class E6_6 {

	/**
	 * テストの合計点・平均点・最高点・最低点を表示する
	 * 人数と点数はキーボードから読み込む
	 */
	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//点数を入力する人数をfinal変数で代入
		final int NINZU = 5;

		//点数を入力する人数と処理の開始を表示
		System.out.println(NINZU + "人のテストの点数を入力せよ。");

		//テストの点数を格納する配列を作成
		int[] testPoints = new int[NINZU];

		//テストの点数を繰り返し入力させる処理を実行
		for (int inputCount = 0; inputCount < NINZU; inputCount++) {

			//何人目の点数を入力するか表示
			System.out.print((inputCount + 1) + "番の点数：");

			//キーボードから入力された整数値を代入
			testPoints[inputCount] = stdIn.nextInt();

		}

		//合計点を代入する変数を作成し、インデックス0の値を代入
		int testPointsSum = testPoints[0];

		//平均点を代入する変数を作成
		double testPointsAve = 0;

		//最高点を代入する変数を作成し、インデックス0の値を代入
		int testPointsMax = testPoints[0];

		//最低点を代入する変数を作成し、インデックス0の値を代入
		int testPointsMini = testPoints[0];

		//最高点・最低点の比較と合計を求める繰り返し処理を実行
		for (int comCount = 1; comCount < testPoints.length; comCount++) {

			//変数「testPointsMax」の値と要素の値を比較
			if (testPointsMax < testPoints[comCount]) {

				//要素の値の方が大きい場合、最高点として代入
				testPointsMax = testPoints[comCount];
			}

			//変数「tesutPointMini」の値と要素の値を比較
			else if (testPointsMini > testPoints[comCount]) {

				//要素の値の方が小さい場合、最低点として代入
				testPointsMini = testPoints[comCount];

			}

			//要素の値を順番に足していく
			testPointsSum += testPoints[comCount];

		}

		//キャストを使用してint型の変数「testPointsSum」から平均を求める
		testPointsAve = (double) testPointsSum / NINZU;

		//テストの合計点を画面に出力
		System.out.println(NINZU + "人のテストの合計点数は、" + testPointsSum + "です。");

		//テストの平均点を画面に出力
		System.out.println(NINZU + "人のテストの平均点は、" + testPointsAve + "です。");

		//テストの最高点を画面に出力
		System.out.println(NINZU + "人のテストの最高点は、" + testPointsMax + "です。");

		//テストの最低点を画面に出力
		System.out.println(NINZU + "人のテストの最低点は、" + testPointsMini + "です。");

	}

}
