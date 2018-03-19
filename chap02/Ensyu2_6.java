package chap02;

//演習2-6:三角形の面積を表示

import java.util.Scanner;

public class Ensyu2_6 {

	public static void main(String[] args) {
		Scanner jissu = new Scanner(System.in);

		System.out.println("三角形の面積を求めます。");
		System.out.print("底辺:");
		double x = jissu.nextDouble();

		System.out.print("高さ:");
		double y = jissu.nextDouble();

		System.out.println("面積は" + (x * y) / 2 + "です。");
	}

}
