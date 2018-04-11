package chap03;

//二つの整数値をキーボードから読み込んで、後者が前者の約数か判定して表示するプログラム

import java.util.Scanner;

public class Ensyu3_2 {

	public static void main(String[] args) {
		Scanner seisu = new Scanner(System.in);

		System.out.print("整数Ａ:");
		int a = seisu.nextInt();

		System.out.print("整数Ｂ:");
		int b = seisu.nextInt();

		int c = a % b;

		if (c == 0)
			System.out.print("ＢはＡの約数です。");
		else
			System.out.print("ＢはＡの約数ではありません。");
	}

}
