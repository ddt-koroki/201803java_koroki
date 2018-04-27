
package C06.E6_4;

//演習「6-4」縦向きの棒グラフを表示するプログラム

import java.util.Scanner;
import java.util.Random;

public class E6_4 {

	/**
	 * 配列に代入された乱数を縦向きの棒グラフで表示する
	 * 最下段には、インデックスを10で割った剰余を表示する
	 */
	public static void main(String[] args) {

		//ランダムの桁数、*の出力の際に使用する変数の値を固定
		final int RAMAX = 10;

		//ランダムに生成される乱数を格納する変数を作成
		Random rand = new Random();

		//キーボードから入力された整数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//要素の数の入力を促すメッセージを表示
		System.out.print("要素数:");

		//キーボードから入力された整数値を代入
		int elNumber = stdIn.nextInt();

		//キーボードから入力された整数値で配列を生成
		int[] arrayInt = new int[elNumber];

		//生成した配列にランダムに値を代入する処理を繰り返すfor文を作成
		for (int elCount = 0; elCount < elNumber; elCount++) {

			//生成した配列に1～10までの乱数を代入
			arrayInt[elCount] = rand.nextInt(RAMAX) + 1;

		}

		//要素に代入された値に従って*を繰り返し出力する処理をfor文で作成(縦の繰り返し)
		for (int elCount = 0; elCount < RAMAX; elCount++) {

			//要素に代入された値に従って*を繰り返し出力する処理をfor文で作成(横の繰り返し)
			for (int putCount = 0; putCount < elNumber; putCount++) {

				//出力する列が1列目か判定
				if (putCount == 0) {

					//代入された値と「RAMAX」を比較し、*を出力するか判定
					if (arrayInt[putCount] >= RAMAX - elCount) {

						//*を出力
						System.out.printf("*");

					} else {

						//空白を出力
						System.out.printf(" ");
					}
				//代入された値と「RAMAX」を比較し、*を出力するか判定
				} else if (arrayInt[putCount] >= RAMAX - elCount) {

					//1桁空白をあけて*を出力する
					System.out.printf("%2s", "*");

				} else {

					//2桁空白を出力
					System.out.printf("%2s", " ");
				}
			}

			//1行の繰り返し処理が終わったら改行する
			System.out.println();
		}

		//表の区切り(-)を出力する繰り返し処理をfor文で作成
		for (int hyCount = 0; hyCount < elNumber * 2 - 1; hyCount++) {

			//ハイフンを出力
			System.out.print("-");
		}

		//改行文字を出力
		System.out.println();

		//インデックスを10で割った剰余を表示させる繰り返し処理
		for (int elCount = 0; elCount < elNumber; elCount++) {

			//1列目かどうか判定
			if (elCount == 0) {

				//インデックスを10で割った剰余を表示
				System.out.print(elCount % 10);

			} else {

				//インデックスを10で割った剰余を表示
				System.out.printf("%2d", elCount % 10);
			}
		}
	}
}
