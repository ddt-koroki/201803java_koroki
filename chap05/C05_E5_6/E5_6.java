package C05.E5_6;

//演習「5-6」float型の変数とint型の変数を利用して計算した結果を表示するプログラム

public class E5_6 {

	/**
	 * float型の変数を「0.0～1.0」まで0.001ずつ増やしていった結果を表示
	 * int型の変数を「0～1000」までインクリメントした値を1000で割った結果を表示
	 * 上記二つの結果を横に並べて表示
	 */
	public static void main(String[] args) {

		//処理内容を画面に表示
		System.out.println("「0.0～1.0まで」0.001ずつ増やしていった値と"
				+ "「0～1000」までインクリメントした値を1000で割った結果を表示します。");

		//表タイトルを体裁を整えて画面に表示
		System.out.printf("%7s","float"); System.out.printf("%11s\n", "int");

		//罫線を画面に表示
		System.out.println("---------------------");

		/*
		 * 繰り返し条件をfor文で設定
		 * float型もint型も計算回数が同じなので片方の条件のみで繰り返し処理を実行
		 */
		for (float xFloat = 0.0F, yInt = 0; xFloat <= 1.0F; xFloat += 0.001F, yInt++) {

			//int型の値をキャスト「float」を使用して計算し、結果を変数に代入
			float yFloat = ((float)yInt / 1000);

			//計算結果を画面に表示
			System.out.printf("%1.7f" + "%12f\n", xFloat,yFloat);

		}

	}

}
