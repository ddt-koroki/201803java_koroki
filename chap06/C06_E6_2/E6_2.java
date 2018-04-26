package C06.E6_2;

//演習「6-2」要素型がint型で要素数が5の配列の要素を表示するプログラム

public class E6_2 {

	/**
	 * 要素型はint型で要素数は5の配列に先頭から5、4、3、2、1を代入し表示する
	 */
	public static void main(String[] args) {

		//int型で要素数5の配列本体を作成
		int[] seisu = new int[5];

		//配列の先頭から順に5～1の値を代入するfor文
		for (int elNumber = 0; elNumber < seisu.length; elNumber++) {

			//配列の先頭から値を代入
			seisu[elNumber] = (seisu.length - elNumber);

		}

		//代入した値を配列の先頭から順に表示するfor文
		for (int elNumber = 0; elNumber < seisu.length; elNumber++) {

			//値を表示する要素と値を画面に表示
			System.out.println("seisu[" + elNumber + "] =" + seisu[elNumber]);

		}

	}

}
