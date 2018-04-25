package C05.E5_3;

//演習「5-3」論理型の変数にtrueやfalseを代入して、その値を表示するプログラム

import java.util.Scanner;

public class E5_3 {

	/**
	 * 論理型の変数にtrueやfalseを代入して、値を表示する
	 */

	public static void main(String[] args) {

		//キーボードから入力された整数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//整数ａの入力を促すメッセージを表示
		System.out.print("整数ａ：");

		//キーボードから入力された整数値を代入
		int seisuA = stdIn.nextInt();

		//整数ｂの入力を促すメッセージを表示
		System.out.print("整数ｂ：");

		//キーボードから入力された整数値を代入
		int seisuB = stdIn.nextInt();

		//論理値リテラルを格納する変数を論理型で作成
		boolean atai;

		//「整数ａ＞整数ｂ」を評価後の論理値を画面に表示
		System.out.println("整数ａ > 整数ｂ =" + (atai = seisuA > seisuB));

		//「整数ａ＜整数ｂ」を評価後の論理値を画面に表示
		System.out.println("整数ａ < 整数ｂ =" + (atai = seisuA < seisuB));

	}

}
