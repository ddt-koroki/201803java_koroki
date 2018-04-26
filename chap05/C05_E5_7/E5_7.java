package C05.E5_7;

//演習「5-7」0.0から1.0まで0.001おきに、その値とその値の2乗を表示するプログラム

public class E5_7 {

	/**
	 * 元の値と2乗した値を表示する
	 */

	public static void main(String[] args) {

		//処理内容を画面に表示
		System.out.println("0.0に0.001ずつ加えた値(上限:1.0)と2乗した値を表示します。");

		//表タイトルを表示
		System.out.printf("%5s", "元の値");

		//表タイトルを表示
		System.out.printf("%9s\n", "2乗");

		//表タイトルと実行結果の区切りを表示
		System.out.println("*********************");

		//繰り返し条件をfor文で指定
		for (float oriValue = 0.0f; oriValue <= 1.0f; oriValue += 0.001) {

			//2乗の計算を実行し、結果を代入
			float square = (oriValue * oriValue);

			//実行結果を画面に表示
			System.out.printf("%1.7f" + "%13f\n", oriValue, square);

		}

	}

}
