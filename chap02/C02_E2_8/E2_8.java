package chap02;		//パッケージの宣言

//演習「2-8」キーボードから読み込んだ整数値の±5範囲をランダムで表示

import java.util.Random;	//乱数生成に必要な決まり文句。クラス宣言の前に書く
import java.util.Scanner;	//キーボードからの読み込みを可能にする決まり文句。プログラムの先頭に書く

public class E2_8 {	//クラス「E2_8」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//生成された乱数を格納する変数を作成
		Random iNrand = new Random();

		//キーボードから読み込んだ整数を格納する変数を作成
		Scanner iKseisu = new Scanner(System.in);

		//整数値の入力を促すメッセージを表示
		System.out.print("整数値：");

		//変数「iSeisu」をint型で作成し、キーボードから読み込んだ整数を代入
		int iSeisu = iKseisu.nextInt();

		//変数「iRand1」をint型で作成し、0～5の間で生成された乱数を代入
		int iRand1 = iNrand.nextInt(6);

		//変数「iRand2」をint型で作成し、0～5の間で生成された乱数を代入
		int iRand2 = iNrand.nextInt(6);

		//キーボードから読み込んだ整数に対して生成された乱数を加減し、±5範囲の整数を画面に表示
		System.out.print("その値の±5の乱数を生成しました。それは" + (iSeisu + iRand1 + -iRand2) + "です。");

	}	//「main」メソッドの終わり
}	//クラス「E2_8」の終わり
