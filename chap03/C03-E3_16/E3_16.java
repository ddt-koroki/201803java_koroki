package chap03;		//パッケージの宣言

//演習「3-16」三つの整数値を読み込んで、昇順にソートするプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E3_16 {	//クラス「E3_16」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから入力された整数を格納するための変数を作成
		Scanner iNseisu = new Scanner(System.in);

		/*
			変数ａの入力を促すメッセージを表示
			変数「iSeisuA」をint型で作成し、キーボードから入力された整数を代入
		 */
		System.out.print("変数ａ:");	int iSeisuA = iNseisu.nextInt();

		/*
			変数ｂの入力を促すメッセージを表示
			変数「iSeisuB」をint型で作成し、キーボードから入力された整数を代入
		 */
		System.out.print("変数ｂ:");	int iSeisuB = iNseisu.nextInt();

		/*
			変数ｃの入力を促すメッセージを表示
			変数「iSeisuC」をint型で作成し、キーボードから入力された整数を代入
		 */
		System.out.print("変数ｃ:");	int iSeisuC = iNseisu.nextInt();

		//変数「iSesuA」、変数「iSeisuB」の比較
		if ( iSeisuA > iSeisuB )

			//変数「iSeisuB」と「iSeisuC]の比較
			if ( iSeisuB > iSeisuC ) {

				/*
				 	変数「iMini」をint型で作成し、変数「iSeisuC」を代入
				 	変数「iSeisuC」に変数「iSeisuA」を代入
				 	変数「iSeisuA」に変数「iMini」を代入
				 */
				int iMini = iSeisuC;	iSeisuC = iSeisuA;	iSeisuA = iMini;

			}	//if文が単一の文しか制御出来ないため、複数の文をブロックで記載

			//変数「iSeisuA」と変数「iSeisuC」の比較
			else if ( iSeisuA > iSeisuC ){

				/*
			 		変数「iMini」をint型で作成し、変数「iSeisuB」を代入
			 		変数「iSeisuB」に変数「iSeisuC」を代入
			 		変数「iSeisuC」に変数「iSeisuA」を代入
			 		変数「iSeisuA」に変数「iMini」を代入
				 */
				int iMini = iSeisuB;	iSeisuB = iSeisuC;	iSeisuC = iSeisuA;	iSeisuA = iMini;

			}	//if文が単一の文しか制御出来ないため、複数の文をブロックで記載

				//変数「iSeisuA」より、変数「iSeisuC」が大きい場合の処理
				else {

					/*
			 			変数「iMini」をint型で作成し、変数「iSeisuB」を代入
			 			変数「iSeisuB」に変数「iSeisuA」を代入
			 			変数「iSeisuA」に変数「iMini」を代入
					 */
					int iMini = iSeisuB;	iSeisuB = iSeisuA;	iSeisuA = iMini;

				}	//if文が単一の文しか制御出来ないため、複数の文をブロックで記載

		//変数「iSeisuA」と変数「iSeisuC」の比較
		else if ( iSeisuA > iSeisuC ) {

			/*
 				変数「iMini」をint型で作成し、変数「iSeisuC」を代入
 				変数「iSeisuC」に変数「iSeisuB」を代入
				変数「iSeisuB」に変数「iSeisuA」を代入
 				変数「iSeisuA」に変数「iMini」を代入
			 */
			int iMini = iSeisuC;	iSeisuC = iSeisuB;	iSeisuB = iSeisuA;	iSeisuA = iMini;

		}	//if文が単一の文しか制御出来ないため、複数の文をブロックで記載

			//変数「iSeisuB」と変数「iSeisuC」の比較
			else if ( iSeisuB > iSeisuC ) {

				/*
 					変数「iMid」をint型で作成し、変数「iSeisuC」を代入
 					変数「iSeisuC」に変数「iSeisuB」を代入
 					変数「iSeisuB」に変数「iMid」を代入
				*/
				int iMid = iSeisuC;		iSeisuC = iSeisuB;	iSeisuB = iMid;
			}	//if文が単一の文しか制御出来ないため、複数の文をブロックで記載

		//処理内容を画面に表示
		System.out.println("入力された整数値を昇順でソートして表示します。");

		//ソート後の変数ａを画面に表示
		System.out.println("変数ａは" + iSeisuA + "です。");

		//ソート後の変数ｂを画面に表示
		System.out.println("変数ｂは" + iSeisuB + "です。");

		//ソート後の変数Ｃを画面に表示
		System.out.println("変数ｃは" + iSeisuC + "です。");

	}	//「main」メソッドの終わり

}	//クラス「E3-16」の終わり
