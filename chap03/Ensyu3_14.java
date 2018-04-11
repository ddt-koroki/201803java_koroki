package chap03;

//二つの整数値を読み込んで、大小それぞれの値を表示するプログラム

import java.util.Scanner;

public class Ensyu3_14 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("整数ａ:");	int a = x.nextInt();
		System.out.print("整数ｂ:");	int b = x.nextInt();

		int mini = 0, max = 0;

		if (a == b)
			System.out.println("二つの値は同じです。");

		else if (a > b) {
			max = a;
			mini = b;
			System.out.println("小さい方の値は" + mini + "です。\n大きい方の値は" + max + "です。");
			}

			else {
				max = b; mini = a;
				System.out.println("小さい方の値は" + mini + "です。\n大きい方の値は" + max + "です。");
				}
		}
}
