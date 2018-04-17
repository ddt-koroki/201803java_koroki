package chap03;		//パッケージの宣言

//演習「3-13」キーボードから読み込んだ三つの整数値の中央値を表示するプログラム

import java.util.Scanner;	//キーボードからの入力を可能にする決まり文句。クラス宣言の前に書く

public class E3_13 {	//クラス「E3_13」の宣言

	public static void main(String[] args) {	//「main」メソッドの終わり

		//キーボードから入力された整数値を格納するための変数を作成
		Scanner iNseisu = new Scanner(System.in);

		/*
			整数値Ａの入力を促すメッセージを表示
			変数「iSeisuA」をint型で作成し、キーボードから入力された整数値を代入
		*/
		System.out.print("整数値Ａ:");	int iSeisuA = iNseisu.nextInt();
		
		/*
			整数値Ｂの入力を促すメッセージを表示
			変数「iSeisuB」をint型で作成し、キーボードから入力された整数値を代入
		*/
		System.out.print("整数値Ｂ:");	int iSeisuB = iNseisu.nextInt();

		/*
			整数値Ｃの入力を促すメッセージを表示
			変数「iSeisuC」をint型で作成し、キーボードから入力された整数値を代入
		*/
		System.out.print("整数値Ｃ:");	int iSeisuC = iNseisu.nextInt();

		//変数「iSeisuA」と変数「iSeisuB」の比較
		if ( iSeisuA >= iSeisuB )
			
			//変数「iSeisuC」と変数「iSeisuB」の比較
			if ( iSeisuB >= iSeisuC )

				//比較の結果「iSeisuA >= iSeisuB >= iSeisuC」であったため、変数「iSeisuB」を中央値として表示
				System.out.println("三つの値の中央値は" + iSeisuB + "です。");

			/*
				変数「iSeisuA」と変数「iSeisuC」の比較を行い、比較結果に応じて中央値の値を表示
				「iSeisuB >= iSeisuA >= iSeisuC」もしくは、「iSeisuB >= iSeisuC >= iSeisuA」
			*/
			else
				System.out.println("三つの値の中央値は" + ( iSeisuA >= iSeisuC ? iSeisuC : iSeisuA ) + "です。");

		//変数「iSeisuA」と変数「iSeisuC」の比較
		else if ( iSeisuA >= iSeisuC )
			
				//比較の結果「iSeisuB >= iSeisuA >= iSeisuC」であったため、変数「iSeisuA」を中央値として表示
				System.out.println("三つの値の中央値は" + iSeisuA + "です。");
		
			/*
			 	変数「iSeisuB」と変数「iSeisuC」の比較を行い、比較結果に応じて中央値の値を表示
				「iSeisuB >= iSeisuC >= iSeisuA」もしくは、「iSeisuC >= iSeisuB >= iSeisuA」
			*/
			else
				System.out.println("三つの値の中央値は" + ( iSeisuB >= iSeisuC ? iSeisuC : iSeisuB) + "です。");

	}	//「main」メソッドの終わり

}	//クラス「E3_13」の終わり
