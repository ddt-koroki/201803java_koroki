package C06.E6_1;

//演習「6-1」要素型がdouble型で要素数5の配列の全要素を表示するプログラム

public class E6_1 {

	public static void main(String[] args) {

		//要素型がdouble型で要素数が5の変数を作成
		double[] realNo = new double[5];

		//要素0に値を導入
		realNo[0] = 4.49;

		//要素1に値を導入
		realNo[1] = 9.94;

		//要素2に値を導入
		realNo[2] = 87.9;

		//要素3に値を導入
		realNo[3] = 9.44;

		//要素4に値を導入
		realNo[4] = 0.98;


		for (int outputCount = 0; outputCount <= 4; outputCount++) {

		//要素0の値を画面に表示
		System.out.println("入力された実数は" + realNo[outputCount] + "です。");

		}
	}

}
