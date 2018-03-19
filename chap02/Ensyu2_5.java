package chap02;

//演習2-5:2つの実数値の和と平均を表示

import java.util.Scanner;

public class Ensyu2_5 {

	public static void main(String[] args) {
		Scanner seisu = new Scanner(System.in);

		System.out.print("xの値:");
		double x = seisu.nextDouble();

		System.out.print("yの値:");
		double y = seisu.nextDouble();

		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}
