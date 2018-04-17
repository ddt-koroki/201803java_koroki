package chap04;		//パッケージの宣言

//演習「4-2」2桁の整数値(10～99)を当てる数当てゲーム

import java.util.Random;	//乱数生成を可能にする決まり文句。クラス宣言の前に書く
import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E4_2 {	//クラス「E4_2」の宣言

	public static void main(String[] args) {	//mainメソッドの宣言

		//生成された乱数を格納するための変数を作成
		Random iRand = new Random();

		//キーボードから入力された整数を格納するための変数を作成
		Scanner iAns = new Scanner(System.in);

		//変数「iRandNo」をint型で作成し、生成された乱数(0～99)を代入
		int iRandNo = iRand.nextInt(100);

		//処理内容を画面に表示
		System.out.print("数当てゲーム開始!!");

		//整数値の入力を促すメッセージを表示
		System.out.print("0～99の数を当ててください。");

		//do文の終了判定に使用する変数「iiAnsSeisu」をint型で作成
		int iAnsSeisu;

		//変数「iAnsSeisu」の値が、変数「iRandNo」と等しくなるまで繰り返し実行
		do {

			//入力を促すメッセージを表示
			System.out.print("いくつかな？");

			//キーボードから入力された整数を変数「iAnsSeisu」に代入
			iAnsSeisu = iAns.nextInt();

			//変数「iAnsSeisu」と「iRandNo」を比較
			if ( iAnsSeisu > iRandNo)

				//ヒントを画面に表示
				System.out.println("もっと小さい数字だよ。");

			//変数「iAnsSeisu」が「iRandNo」より小さい場合に実行
			else if ( iAnsSeisu < iRandNo )

				//ヒントを画面に表示
				System.out.println("もっと大きな数字だよ。");

		}while ( iAnsSeisu != iRandNo );	//do文の終了判定

		//正解メッセージを画面に表示
		System.out.println("おめでとう!!正解です。");

	}	//mainメソッドの終わり

}	//クラス「E4_2」の終わり