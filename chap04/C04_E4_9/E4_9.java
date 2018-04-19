package C04_E4_9;	//パッケージの宣言

//演習「4-9」正の整数値nを読み込んで、1からnまでの積を求めるプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E4_9 {	//クラス「E4_9」の宣言

	public static void main(String[] args) {	//mainメソッドの宣言

		//キーボードから入力された整数値を格納する変数を作成
		Scanner iSc = new Scanner(System.in);

		//正の整数の入力を促すメッセージを表示
		System.out.print("正の整数値:");

		//変数「iSeisu」をint型で作成し、キーボードから入力された整数値を代入
		int iSeisu = iSc.nextInt();

		//変数「iCount」をint型で作成し、「1」で初期化
		int iCount = 1;

		/*
			変数「iPro」をint型で作成し、「1」で初期化
			後続のwhile文で積を代入
		*/
		int iPro = 1;

		/*
			while文の終了判定
			変数「iCount」の値が、変数「iSeisu」より小さい場合、繰り返し実行
		*/
		while ( iCount <= iSeisu ) {

			//変数「iPro」と変数「iCount」の積を求め、結果を変数「iPro」に代入
			iPro *= iCount;

			//変数「iCount」の値をインクリメントする。
			iCount++;

		}	//while文の終わり

		//処理結果を画面に表示
		System.out.println("1から" + iSeisu + "までの積は" + iPro + "です。");

	}	//mainメソッドの終わり

}	//クラス「E4_9」の宣言
