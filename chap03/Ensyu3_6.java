package chap03;

//正の整数値を読み込んで、10の倍数か判定するプログラム

import java.util.Scanner;

public class Ensyu3_6 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("正の整数:");
		int a = x.nextInt();

		if (a > 0)
			if (a % 10 == 0)
				System.out.println("その値は10の倍数です。");
			else
				System.out.println("その値は10の倍数ではありません。");
		else
			System.out.println("正でない値が入力されました。");
	}

}
