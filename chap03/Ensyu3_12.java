package chap03;

//キーボードから読み込んだ三つの整数値のうち、最小値を表示するプログラム

import java.util.Scanner;

public class Ensyu3_12 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("整数値Ａ:");	int a = x.nextInt();
		System.out.print("整数値Ｂ:");	int b = x.nextInt();
		System.out.print("整数値Ｃ:");	int c = x.nextInt();

		int mini = a;
		if ( mini > b) mini = b;
		if ( mini > c) mini = c;

		System.out.println("最小値は" + mini + "です。");
	}

}
