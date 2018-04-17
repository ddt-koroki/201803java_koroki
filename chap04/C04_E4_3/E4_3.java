package chap04;		//パッケージの宣言

//演習「4-3」二つの整数値を読み込んで、小さい数字以上大きい数字以下の数字を表示するプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E4_3 {	//クラス「E4_3」の宣言

	public static void main(String[] args) {	//mainメソッドの宣言

		//キーボードから入力された整数を格納するための変数を作成
		Scanner iSeisu = new Scanner(System.in);

		//整数値の入力を促すメッセージを表示
		System.out.print("整数値ａ:");

		//変数「iSeisuA」をint型で作成し、キーボードから入力された整数値を代入
		int iSeisuA = iSeisu.nextInt();

		//整数値の入力を促すメッセージを表示
		System.out.print("整数値ｂ:");

		//変数「iSeisuB」をint型で作成し、キーボードから入力された整数値を代入
		int iSeisuB = iSeisu.nextInt();

		//小さい方の数字を表示させるため、変数「iSeisuA」と変数「iSeisuB」を比較
		if ( iSeisuA > iSeisuB )

			//変数「iSeisuB」に空白を追加して表示
			System.out.print( iSeisuB + " ");

		//小さい方の数字を表示させるため、変数「iSeisuA」と変数「iSeisuB」を比較
		else if ( iSeisuA < iSeisuB )

			//変数「iSeisuA」に空白を追加して表示
			System.out.print( iSeisuA + " " );


		//変数「iSeisuA」と「iSeisuB」が等しくなるまで繰り返し実行
		do {

			//小さい数字を持つ変数を判定するため、変数「iSeisuA」と変数「iSeisuB」を比較
			if ( iSeisuA > iSeisuB ) {

				//変数「iSeisuB」が小さい場合、値に「1」を足し画面に表示
				System.out.print( iSeisuB = ( iSeisuB + 1 ));

				/*
					空白の表示
					int型の足し算にString型の空白は足せないため、別で記載
				 */
				System.out.print(" ");

			}	//if文が単一の文しか制御出来ないため、複数の文をブロックで記載

			//変数「iSeisuA」が小さい場合の処理
			else {

				//値に「1」を足し画面に表示
				System.out.print( iSeisuA = ( iSeisuA + 1 ));

				/*
					空白の表示
					int型の足し算にString型の空白は足せないため、別で記載
				*/
				System.out.print(" ");

			}	//if文が単一の文しか制御出来ないため、複数の文をブロックで記載

		}while ( iSeisuA != iSeisuB );	//do文の終了判定

	}	//mainメソッドの終わり

}	//クラス「E4_3」の終わり
