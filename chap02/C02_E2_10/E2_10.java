package chap02;		//パッケージの宣言

//演習「2-10」姓名を個別に入力して、挨拶を行うプログラム

import java.util.Scanner;	//キーボードからの読み込みを可能にする決まり文句。クラス宣言の前に書く

public class E2_10 {	//クラス「E2_10」の宣言

	public static void main(String[] args) {		//「main」メソッドの宣言

		//キーボードから読み込んだ文字列を格納する変数を作成
		Scanner stName = new Scanner(System.in);

		//「姓」の入力を促すメッセージを表示
		System.out.print("姓：");

		//変数「sSei」をString型で作成し、キーボードから読み込んだ文字列を代入
		String sSei = stName.next();

		//「名」の入力を促すメッセージを表示
		System.out.print("名：");

		//変数「sMei」をString型で作成し、キーボードから読み込んだ文字列を代入
		String sMei = stName.next();

		//各変数と文字列を連結し、結果を画面に表示
		System.out.println("こんにちは" + sSei + sMei + "さん。");

	}	//「main」メソッドの終わり

}	//クラス「E2_10」の終わり
