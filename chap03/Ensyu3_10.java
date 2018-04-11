package chap03;

//二つの整数値を読み込んで、差を表示するプログラム

import java.util.Scanner;

public class Ensyu3_10 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("整数値Ａ:");	int a = x.nextInt();
		System.out.print("整数値Ｂ:");	int b = x.nextInt();

		System.out.print("二つの整数値の差は" + (a > b ? a - b : b - a) + "です。");

	}

}
