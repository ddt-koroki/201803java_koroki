package chap02;

//キーボードから読み込んだ整数値の±5範囲をランダムで表示

import java.util.Random;
import java.util.Scanner;

public class Ensyu2_8 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int a = stdIn.nextInt();

		int b = rand.nextInt(6);
		int c = rand.nextInt(6);

		System.out.print("その値の±5の乱数を生成しました。それは" + (a + b + -c) + "です。");

	}

}
