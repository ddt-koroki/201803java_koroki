package chap03;		//パッケージの宣言

//演習「3-17」0、1、2のいずれかの値の乱数を生成し、実行結果を表示するプログラム

import java.util.Random;	//乱数を生成するために必要な決まり文句。クラス宣言の前に書く

public class E3_17 {	//クラス「E3_17」の宣言

	public static void main(String[] args) {	//「main」メソッドの宣言

		//生成された乱数を格納するための変数を作成
		Random iNrand = new Random();

		//変数「iRand」を作成し、生成された乱数を代入
		int iRand = iNrand.nextInt(3);

		//変数「iRand」の値（0～2）によって何れかのケースを実施
		switch ( iRand ) {

		//変数「iRand」の値が「0」の場合、画面に「グー」と表示され終了
		case 0 : System.out.println("グー"); break;

		//変数「iRand」の値が「1」の場合、画面に「チョキ」と表示され終了
		case 1 : System.out.println("チョキ"); break;

		//変数「iRand」の値が「2」の場合、画面に「パー」と表示され終了
		case 2 : System.out.println("パー"); break;

		}	//switch文の終わり

	}	//「main」メソッドの終わり

}	//クラス「E3_17」の終わり