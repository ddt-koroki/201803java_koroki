package chap03;		//パッケージの宣言

//演習「3-5」正の整数値を読み込んで5で割り切れる場合は、5で割り切れると表示するプログラム

import java.util.Scanner;	//キーボードからの読み込みを可能にする決まり文句。クラス宣言の前に書く

public class E3_5 {	//クラス「E3_5」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから読み込んだ整数値を格納する変数を作成
		Scanner iNseisu = new Scanner(System.in);

		//正の整数の入力を促すメッセージを表示
		System.out.print("正の整数:");

		//変数「iSeisuA」をint型で作成し、キーボードから読み込んだ整数値を代入
		int iSeisuA = iNseisu.nextInt();

		//変数「iSeisuA」と「0」を比較し、正の整数が入力されているか判定
		if ( iSeisuA > 0 )

			//変数「iSeisuA」を5で割ったときの余りが「0」となるか判定
			if ( iSeisuA % 5 == 0 )

				//余りが「0」の場合、5で割り切れる旨、画面にメッセージを表示
				System.out.println("その値は5で割り切れます。");

			//余りが「0」ではない場合、5で割り切れない旨、画面にメッセージを表示
			else
				System.out.println("その値は5で割り切れません。");

		//変数「iSeisuA」が「0」より小さい場合、正の整数が入力されていない旨、画面にメッセージを表示
		else
			System.out.println("正でない値が入力されました。");

	}	//「main」メソッドの終わり

}	//クラス「E3_5」の終わり
