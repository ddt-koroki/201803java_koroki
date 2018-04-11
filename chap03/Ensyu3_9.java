package chap03;

//二つの実数値を読み込んで、大きい方を表示するプログラム

import java.util.Scanner;

public class Ensyu3_9 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("実数ａ:");	double a = x.nextDouble();
		System.out.print("実数ｂ:");	double b = x.nextDouble();

		System.out.println("大きい方の値は" + (a > b ? a : b) + "です。");

	}

}
