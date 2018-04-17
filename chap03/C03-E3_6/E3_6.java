package chap03;		//パッケージの宣言

//演習「3-6」正の整数値を読み込んで、10の倍数か判定するプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E3_6 {	//クラス「E3_6」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから読み込んだ整数値を格納する変数を作成
		Scanner iNseisu = new Scanner(System.in);

		//正の整数の入力を促すメッセージを表示
		System.out.print("正の整数:");

		//変数「iSeisuA」をint型で作成し、キーボードから読み込んだ整数値を代入
		int iSeisuA = iNseisu.nextInt();

		//変数「iSeisuA」が正の整数か判定
		if ( iSeisuA > 0 )

			//変数「iSeisuA」を10で割った余りが「0」であるか判定
			if ( iSeisuA % 10 == 0 )

				//余りが「0」であった場合、10の倍数である旨、画面にメッセージを表示
				System.out.println("その値は10の倍数です。");

			//「0」でない場合、10の倍数ではない旨、画面にメッセージを表示
			else
				System.out.println("その値は10の倍数ではありません。");

		//変数「iSeisuA」が負の整数であった場合、正でない旨、画面にメッセージを表示
		else
			System.out.println("正でない値が入力されました。");

	}	//「main」メソッドの終わり

}	//クラス「E3_6」の終わり
