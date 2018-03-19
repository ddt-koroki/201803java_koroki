package chap02;

//演習2-4:キーボードから入力された整数値に10を加減算した結果を表示

import java.util.Scanner;

public class Ensyu2_4 {

	public static void main(String[] args) {
		Scanner Seisu = new Scanner(System.in);

		System.out.print("整数値:" );
		int x = Seisu.nextInt();

		System.out.println("10を加えた値は" + (x + 10) + "です。");
		System.out.println("10を減じた値は" + (x - 10) + "です。");
	}
}
