package C05.E5_2;

//演習「5_2」float型とdouble型の変数に値を読み込んで表示

import java.util.Scanner;

public class E5_2 {

	/**
	 * float型とdouble型の変数の値を表示
	 */
	public static void main(String[] args) {

		//キーボードから入力された実数値を格納する変数を作成
		Scanner stdIn = new Scanner(System.in);

		//処理内容を画面に表示
		System.out.println("変数xはfloat型で、変数yはdouble型です。");

		//xの値の入力を促すメッセージを表示
		System.out.print("x:");

		//キーボードから入力された実数値を代入
		float xFloat = stdIn.nextFloat();

		//yの値の入力を促すメッセージを表示
		System.out.print("y:");

		//キーボードから入力された実数値を代入
		double yDouble = stdIn.nextDouble();

		//xとyの値を画面に表示
		System.out.println("x=" + xFloat + "\ny=" + yDouble);

	}

}
