package chap03;

//正の整数値を読み込んで、3で割った値に応じて結果を表示するプログラム

import java.util.Scanner;

public class Ensyu3_7 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("正の整数:");
		int a = x.nextInt();

		if (a > 0)
			if (a % 3 == 0)
				System.out.println("その値は3で割り切れます。");
			else
				System.out.println("その値を3で割った余りは" + (a % 3) + "です。");
		else
			System.out.println("正でない値が入力されました。");
	}
}
