package C06.E6_3;

//演習「6-3」要素型がdouble型で要素数が5の配列の要素に対して、先頭から順に値を代入するプログラム

public class E6_3 {

	/**
	 * 要素型がdouble型で要素数が5の配列の要素に先頭から順に値を代入する
	 * 代入する値は1.1、2.2、3.3、4.4、5.5
	 */
	public static void main(String[] args) {

		//double型で配列数5の変数を作成
		double[] arrayDbl = new double[5];

		//配列の先頭から値を代入するfor文
		for (int elNumber = 0; elNumber < arrayDbl.length; elNumber++) {

			/*
			 * 計算結果の値を代入
			 * 小数点の計算は誤差が出るため、一度整数で計算後10で割る
			 */
			arrayDbl[elNumber] = (((double) elNumber + 1) * 11) /10;

		}

		//配列の先頭から値を表示するfor文
		for (int elNumber = 0; elNumber < arrayDbl.length; elNumber++) {

			//配列の先頭から値を表示
			System.out.println("arrayDbl[" + elNumber + "] =" + arrayDbl[elNumber]);

		}
	}
}
