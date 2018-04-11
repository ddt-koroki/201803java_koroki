package chap03;

//二つの整数値を読み込んで、降順にソートするプログラム

import java.util.Scanner;

public class Ensyu3_15 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("整数値ａ:");
		int a = x.nextInt();

		System.out.print("整数値ｂ:");
		int b = x.nextInt();

		if (b > a) {
			int t = a;
			a = b;
			b = t;
		}

	System.out.println("入力された整数値を降順にソートしました。");
	System.out.println("変数ａは" + a + "です。\n変数ｂは" + b + "です。");
	}
}
