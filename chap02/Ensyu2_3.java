package chap02;

//演習2-3：キーボードから入力された整数値を反復して表示

import java.util.Scanner;

public class Ensyu2_3 {

	public static void main(String[] args) {
		Scanner seisu = new Scanner(System.in);

		System.out.print("整数値：");
		int x = seisu.nextInt();

		System.out.println(x + "と入力しましたね。");
	}
}
