package C06.E6_5;

//演習「6-5」配列の要素数と個々の要素の値を読み込んで表示するプログラム

import java.util.Scanner;

public class E6_5 {

	/**
	 * 配列の要素数と個々の要素の値を読み込んで表示する
	 * 各要素はコンマで区切り、{}で囲んだ形式で表示
	 */

	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//処理内容を表示
		System.out.println("要素数を整数で入力してください。");

		//入力項目を表示
		System.out.print("要素数:");

		//キーボードから入力された整数値を代入
		int eleNumber = stdIn.nextInt();

		//キーボードから入力された整数値を格納する配列をint型で作成
		int[] element = new int[eleNumber];

		//値の入力を促すメッセージを表示
		System.out.println("作成した要素数分、整数で値を入力してください。");

		//作成した要素数分の値を入力する処理を繰り返し実行
		for (int inputCount = 0; inputCount < element.length; inputCount++) {

			//要素に値の入力を促すメッセージを表示
			System.out.printf("a[%d] = ", inputCount);

			//キーボードから入力された整数値を代入
			element[inputCount] = stdIn.nextInt();

		}

		//要素の値を表示させる形式の準備
		System.out.print("a = {");

		//要素の値を表示させる処理を繰り返し実行
		for (int outputCount = 0; outputCount < element.length; outputCount++) {

			//要素の値を画面に表示
			System.out.print(element[outputCount]);

			//区切り文字を出力するかの判定と画面へ表示させる処理
			System.out.print(outputCount + 1 == element.length ? "" : ", ");
		}

		//要素の値を全て表示後、形式の終わりを出力
		System.out.println("}");

	}

}
