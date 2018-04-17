package chap03;		//パッケージの宣言

//演習「3-2」二つの整数値をキーボードから読み込んで、後者が前者の約数か判定して表示するプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E3_2 {	//クラス「E3_2」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから読み込んだ整数を格納する変数を作成
		Scanner iNseisu = new Scanner(System.in);

		//整数Ａの入力を促すメッセージを表示
		System.out.print("整数Ａ:");

		//変数「iSeisuA」をint型で作成し、キーボードから読み込んだ整数を代入
		int iSeisuA = iNseisu.nextInt();

		//整数Ｂの入力を促すメッセージを表示
		System.out.print("整数Ｂ:");

		//変数「iSeisuB」をint型で作成し、キーボードから読み込んだ整数を代入
		int iSeisuB = iNseisu.nextInt();

		//変数「iSyoyo」をint型で作成し、変数「iSeisuA」を変数「iSeisuB」で割った余りを代入
		int iSyoyo = iSeisuA % iSeisuB;

		//変数「iSyoyo」が「0」と等しいか判定
		if (iSyoyo == 0)

			//変数「iSyoyo」が「0」と等しい場合、整数Ｂが整数Ａの約数である旨、画面に結果を表示
			System.out.print("ＢはＡの約数です。");

		//変数「iSyoyo」が「0」と等しくない場合、整数Ｂが整数Ａの約数でない旨、画面に結果を表示
		else
			System.out.print("ＢはＡの約数ではありません。");

	}	//「main」メソッドの終わり

}	//クラス「E3_2」の終わり
