package chap03;		//パッケージの宣言

//演習「E3-12」キーボードから読み込んだ三つの整数値のうち、最小値を表示するプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E3_12 {	//クラス「E3_12」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから入力された整数値を格納する変数を作成
		Scanner iNseisu = new Scanner(System.in);

		//整数値Ａの入力を促すメッセージを表示し、変数「iSeisuA」をint型で作成
		System.out.print("整数値Ａ:");	int iSeisuA = iNseisu.nextInt();

		//整数値Ｂの入力を促すメッセージを表示し、変数「iSeisuB」をint型で作成
		System.out.print("整数値Ｂ:");	int iSeisuB = iNseisu.nextInt();

		//整数値Ｃの入力を促すメッセージを表示し、変数「iSeisuC」をint型で作成
		System.out.print("整数値Ｃ:");	int iSeisuC = iNseisu.nextInt();

		//最小値を格納する変数「iMini」をint型で作成し、変数「iSeisuA」の値で初期化
		int iMini = iSeisuA;

		/*
		変数「iMini」と変数「iSeisuB」で比較を行い、
		変数「iSeisuB」が小さかった場合、変数「iMini」の値を更新する
		*/
		if ( iMini > iSeisuB ) iMini = iSeisuB;

		/*
		変数「iMini」と変数「iSeisuC」で比較を行い、
		変数「iSeisuC」が小さかった場合、変数「iMini」の値を更新する
		*/
		if ( iMini > iSeisuC ) iMini = iSeisuC;

		//比較結果を画面に表示
		System.out.println("最小値は" + iMini + "です。");

	}	//「main」メソッドの終わり

}	//クラス「E3_12」の終わり
