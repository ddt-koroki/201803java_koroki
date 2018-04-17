package chap03;		//パッケージの宣言

//演習「3-7」正の整数値を読み込んで、3で割った値に応じて結果を表示するプログラム

import java.util.Scanner;	//キーボードからの読み込みを可能にする決まり文句。クラス宣言の前に書く

public class E3_7 {	//クラス「E3_7」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから読み込んだ整数を格納する変数を作成
		Scanner iNseisu = new Scanner(System.in);

		//正の整数の入力を促すメッセージを表示
		System.out.print("正の整数:");

		//変数「iSeisuA」をint型で作成し、キーボードから読み込んだ整数を代入
		int iSeisuA = iNseisu.nextInt();

		//変数「iSeisuA」が正の整数か判定
		if ( iSeisuA> 0 )

			//変数「iSeisuA」を「3」で割ったときの余りが「0」になるか判定
			if ( iSeisuA % 3 == 0 )

				//余りが「0」であった場合、割り切れる旨、画面にメッセージを表示
				System.out.println("その値は3で割り切れます。");

			//割り切れなかった場合は、割り切れない旨と余りを画面に表示
			else
				System.out.println("その値を3で割った余りは" + ( iSeisuA % 3 ) + "です。");

		//負の整数が入力されていた場合は、正でない値が入力された旨、画面にメッセージを表示
		else
			System.out.println("正でない値が入力されました。");

	}	//「main」メソッドの終わり

}	//クラス「E3_7」の終わり
