package chap03;

//キーボードから読み込んだ三つの整数値の中央値を表示するプログラム

import java.util.Scanner;

public class Ensyu3_13 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("整数値Ａ:");	int a = x.nextInt();
		System.out.print("整数値Ｂ:");	int b = x.nextInt();
		System.out.print("整数値Ｃ:");	int c = x.nextInt();

		if (a >= b)
			if (b >= c)
				System.out.println("三つの値の中央値は" + b + "です。");	//a>=b>=c
			else
				System.out.println("三つの値の中央値は" + (a >= c ? c : a) + "です。");		//a>=c>=b or c>=a>=b
		else if (a >= c)
				System.out.println("三つの値の中央値は" + a + "です。");	//b>=a>=c
			else
				System.out.println("三つの値の中央値は" + (b >= c ? c : b) + "です。");	//b>=c>=a or c>=b>=a
	}

}
