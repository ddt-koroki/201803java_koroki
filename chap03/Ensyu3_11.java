package chap03;

//二つの整数値を読み込んで、差に応じて結果を表示するプログラム

import java.util.Scanner;

public class Ensyu3_11 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("整数値Ａ:");	int a = x.nextInt();
		System.out.print("整数値Ｂ:");	int b = x.nextInt();

		int c = a > b ? a - b : b -a;

		System.out.println("それらの差は" + (c > 10 ? "11以上です。" : "10以下です。"));

	}

}
