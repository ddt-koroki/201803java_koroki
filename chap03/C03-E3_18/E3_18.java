package chap03;		//パッケージの宣言

//演習「3-18」月を1～12の整数値として読み込んで、対応する季節を表示するプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E3_18 {	//クラス「E3-18」の宣言

	public static void main(String[] args) {	//mainメソッドの宣言

		//キーボードから入力された整数を格納するための変数を作成
		Scanner iSeisu = new Scanner(System.in);

		//処理内容と月の入力を促すメッセージを表示
		System.out.print("対応する季節を表示します。月を入力してください。");

		//変数「iMonth」をint型で作成し、キーボードから入力された整数を代入
		int iMonth = iSeisu.nextInt();

		//変数「iMonth」の値(1～12)によって以下のケースを実行
		switch ( iMonth ) {

		//整数値「3」の季節は春のため、「case 5」を実行するように記載
		case 3	:

		//整数値「4」の季節は春のため、「case 5」を実行するように記載
		case 4	:

		/*
			変数「iMonth」の値が「3」～「5」の場合に実行
			画面にメッセージを表示し終了
		 */
		case 5	: System.out.println("季節は春です。"); break;

		//整数値「6」の季節は夏のため、「case 8」を実行するように記載
		case 6	:

		//整数値「7」の季節は夏のため、「case 8」を実行するように記載
		case 7	:

		/*
			変数「iMonth」の値が「6」～「8」の場合に実行
			画面にメッセージを表示し終了
		 */
		case 8	: System.out.println("季節は夏です。"); break;

		//整数値「9」の季節は秋のため、「case 11」を実行するように記載
		case 9	:

		//整数値「10」の季節は秋のため、「case 11」を実行するように記載
		case 10	:

		/*
			変数「iMonth」の値が「9」～「11」の場合に実行
			画面にメッセージを表示し終了
		 */
		case 11	: System.out.println("季節は秋です。"); break;

		//整数値「12」の季節は冬のため、「case 2」を実行するように記載
		case 12	:

		//整数値「1」の季節は冬のため、「case 2」を実行するように記載
		case 1	:


		/*
			変数「iMonth」の値が「1」～「2」、「12」の場合に実行
			画面にメッセージを表示し終了
		 */
		case 2	: System.out.println("季節は冬です。" ); break;

		}	//swith文の終わり

	}	//mainメソッドの終わり

}	//クラス「E3_18」の終わり