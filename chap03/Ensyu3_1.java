package chap03;

//整数値をキーボードから読み込んで絶対値を表示するプログラム

import java.util.Scanner;

public class Ensyu3_1 {

	public static void main(String[] args) {
		Scanner seisu = new Scanner(System.in);

		System.out.print("整数値:");
		int n = seisu.nextInt();

		if (n > 0)
			System.out.println("その絶対値は" + n + "です。");
		else if (n < 0)
			System.out.println("その絶対値は" + -n + "です。");
		else
			System.out.println("その絶対値は" + n + "です。");
	}

}
