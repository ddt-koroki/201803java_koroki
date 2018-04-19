package C04_E4_8;	//パッケージの宣言

//演習「E4_8」正の整数値を読み込んで、その桁数を出力するプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E4_8 {	//クラス「E4_8」の宣言

	public static void main(String[] args) {	//mainメソッドの宣言

		//キーボードから入力された整数値を格納する変数を作成
		Scanner iSc	= new Scanner(System.in);

		//整数値の入力を促すメッセージを表示
		System.out.print("整数値：");

		//変数「iSeisu」をint型で作成し、キーボードから入力された整数値を代入
		int iSeisu	= iSc.nextInt();

		//変数「iCount」をint型で作成し、「0」で初期化
		int iCount	= 0;

		//while文の終了判定
		while ( iSeisu > 0 ) {

			//入力された整数値を10で割り商を変数「iSeisu」に代入
			iSeisu /= 10;

			//整数値を割るごとに変数「iCount」をインクリメント
			iCount++;

		}	//while文の終わり

		//変数「iCount」をインクリメントした回数を桁数として画面に表示
		System.out.println("その値は" + iCount + "桁です。");

	}	//mainメソッドの終わり

}	//クラス「E4_8」の終わり
