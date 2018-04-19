package C04.E4_11;

//演習「4-11」正の整数値を0までカウントダウンするList4-4をfor文で作成

import java.util.Scanner;

public class E4_11 {

	public static void main(String[] args) {

		/*
		 * キーボードから入力された整数値を格納する変数の作成
		 * キーボードから入力する値は、カウントダウンを開始する値
		 */
		Scanner iStdIn = new Scanner(System.in);

		//処理内容を画面に表示
		System.out.println("カウントダウンします。");

		//変数「iSeisu」をint型で作成
		int iSeisu;

		/*
		 * キーボードから正しい整数値が入力されるまで繰り返し実行する
		 * 誤入力を防止するための処理
		 */
		do {

			//正の整数値の入力を促すメッセージを表示
			System.out.print("正の整数値：");

			//キーボードから入力された正の整数値を代入
			iSeisu = iStdIn.nextInt();

			/*
				while文の終わり
				入力された整数値が正の整数値であればdo文を終了する
			 */
		} while (iSeisu < 0);

		/*
		 * 変数「iCdown」に代入された正の整数値が「0」未満になるまでデクリメントを行う
		 * 条件を満たす間、繰り返し同じ処理をする場合、for文を使用した方が冗長にならない
		 */
		for (int iCdown = iSeisu; iCdown >= 0; iCdown--)

			//デクリメント前の値を表示する
			System.out.println(iCdown);
	}

}
