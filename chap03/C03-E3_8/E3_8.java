package chap03;		//パッケージの宣言

//演習「3-8」キーボードから読み込んだ点数に応じて、結果を表示するプログラム

import java.util.Scanner;	//キーボードからの読み込みを可能にする決まり文句。クラス宣言の前に書く

public class E3_8 {	//クラス「E3_8」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//キーボードから読み込んだ整数を格納する変数を作成
		Scanner iNseisu = new Scanner(System.in);

		//点数の入力を促すメッセージを表示
		System.out.print("点数:");

		//変数「iTen」をint型で作成し、キーボードから読み込んだ整数を代入
		int iTen = iNseisu.nextInt();

		//変数「iTen」が「60」未満か判定
		if ( iTen < 60 )

			//変数「iTen」の値が「60」未満の場合、「不可」のステータスを返す
			System.out.println("判定結果は「不可」です。");

		//変数「iTen」が「60」以上「70」未満か判定
		else if ( iTen >= 60 && iTen < 70 )

			//変数「iTen」の値が「60」以上「70」未満の場合、「可」のステータスを返す
			System.out.println("判定結果は「可」です。");

		//変数「iTen」の値が「70」以上「80」未満か判定
		else if ( iTen>= 70 && iTen <80 )

			//変数「iTen」の値が「70」以上「80」未満の場合、「良」のステータスを返す
			System.out.println("判定結果は「良」です。");

		//変数「iTen」の値が何れにも当たらない場合、「優」のステータスを返す
		else
			System.out.println("判定結果は「優」です。");

		}	//「main」メソッドの終わり

}	//クラス「E3_8」の終わり
