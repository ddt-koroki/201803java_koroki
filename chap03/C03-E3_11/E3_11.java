package chap03;		//パッケージの宣言

//演習「3-11」二つの整数値を読み込んで、差に応じて結果を表示するプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E3_11 {	//クラス「E3-11」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから入力された整数値を格納するための変数を作成
		Scanner iNseisu = new Scanner(System.in);

		/*整数値Ａの入力を促すメッセージを表示
		変数「iSeisuA」をint型で作成し、キーボードから入力された整数値を代入
		*/
		System.out.print("整数値Ａ:");	int iSeisuA = iNseisu.nextInt();

		/*整数値Ｂの入力を促すメッセージを表示
		変数「iSeisuB」をint型で作成し、キーボードから入力された整数値を代入
		*/
		System.out.print("整数値Ｂ:");	int iSeisuB = iNseisu.nextInt();

		/*入力した整数Ａと整数Ｂを比較し、比較結果に応じて減算を行い、
		int型で作成した変数「iSeisuC」に減算後の値を代入
		*/
		int iSeisuC = iSeisuA > iSeisuB ? iSeisuA - iSeisuB : iSeisuB -iSeisuA;

		//変数「iSeisuC」の値を10より大きいか判定し、判定結果に応じて画面にメッセージを表示
		System.out.println("それらの差は" + ( iSeisuC > 10 ? "11以上です。" : "10以下です。"));

	}	//「main」メソッドの終わり

}	//クラス「E3-11」の終わり
