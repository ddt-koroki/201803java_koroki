package chap03;

//正の整数値を読み込んで5で割り切れる場合は、5で割り切れると表示するプログラム

import java.util.Scanner;

public class Ensyu3_5 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("正の整数:");
		int a = x.nextInt();

		if (a > 0)
			if (a % 5 == 0)
				System.out.println("その値は5で割り切れます。");
			else
				System.out.println("その値は5で割り切れません。");
		else
			System.out.println("正でない値が入力されました。");
	}

}