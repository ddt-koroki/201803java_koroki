package C06.E6_9;

//演習「6-9」要素型がint型である配列を作り、全要素を乱数で埋め尽くすプログラム

import java.util.Scanner;
import java.util.Random;

public class E6_9 {

	/**
	 * int型の配列を作成し、全要素を乱数で埋めるプログラム
	 * 乱数は1～10までの整数
	 * 要素数はキーボードから入力
	 */
	public static void main(String[] args) {

		//キーボードから入力した値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//生成された乱数を格納する変数を作成
		Random randIn = new Random();

		//処理内容を画面に表示
		System.out.println("配列を作成し、全要素を乱数で埋め尽くします。");

		//操作内容を画面に表示
		System.out.println("要素数を入力してください。");

		//要素数の入力を求めるメッセージを表示
		System.out.print("要素数:");

		//キーボードから入力された値を代入
		int eleNumber = stdIn.nextInt();

		//配列を作成
		int[] arrayInt = new int[eleNumber];

		//各要素に乱数を代入する繰り返し処理を設定
		for (int eleCount = 0; eleCount < eleNumber; eleCount++) {

			//要素に生成された乱数を代入
			arrayInt[eleCount] = randIn.nextInt(10) + 1;

		}

		//配列「arrayInt」の全要素を走査
		for (int elePoint : arrayInt) {

			//各要素の値を画面に表示
			System.out.print(elePoint + " ");
		}

	}

}
