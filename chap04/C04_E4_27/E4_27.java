package C04.E4_27;

//演習「4-27」数当てゲームプログラム(入力回数制限付き)

import java.util.Random;
import java.util.Scanner;

public class E4_27 {

	/**
	 * 入力回数制限付き数当てゲーム
	 * 回数制限は0～9の間でランダム
	 */

	public static void main(String[] args) {

		//生成された乱数を格納する変数を作成
		Random randIn = new Random();

		//キーボードから入力された整数を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//数当てゲームの答えをランダムに生成して変数「correctNo」に代入
		int correctNo = randIn.nextInt(100);

		//処理の開始を画面に表示
		System.out.println("数当てゲーム開始!!");

		//処理内容を画面に表示
		System.out.println("0～99の数を当ててください。(入力回数に制限があります。)");

		//入力の制限回数(1～9)をランダムで生成し、変数「safeCount」に代入
		int safeCount = randIn.nextInt(9) + 1;

		//キーボードから入力された整数を保持する変数を作成
		int anserNo = 0;

		//答えを入力した回数をカウントする変数を作成
		int anserCount = 0;

		//正解するまで整数を入力させるdo文
		do {

			//答えの入力を促すメッセージを表示
			System.out.print("正解はいくつかな：");

			//キーボードから入力された整数値を代入
			anserNo = stdIn.nextInt();

			//入力された整数と答えを比較し、対応するメッセージを表示
			if (anserNo > correctNo) {

				//入力された整数の方が小さい場合のメッセージを表示
				System.out.println("もっと小さな数字だよ。");

			}

			//入力された整数と答えを比較し、対応するメッセージを表示
			else if (anserNo < correctNo) {

				//入力された整数の方が大きい場合のメッセージを表示
				System.out.println("もっと大きな数字だよ。");

			}

			//入力回数をカウント
			anserCount++;

			//入力回数と回数制限の値を比較
			if (anserCount == safeCount) {

				//入力回数が回数制限の値と同じの場合、do文から抜ける
				break;

			}

		//答えと入力した整数値が異なる場合、繰り返し実行する
		} while (anserNo != correctNo);

		//入力した整数値と答えを比較し、対応するメッセージを表示
		if (anserNo == correctNo) {

			//入力した整数値と答えが同じだった場合のメッセージを表示
			System.out.println("おめでとう!!正解だよ。");

		} else {

			//答えが違っていた場合のメッセージを表示
			System.out.println("残念!!" + safeCount + "回間違えちゃったよ。");

			//答えを表示
			System.out.println("正解は" + correctNo + "だよ。");
		}
	}
}
