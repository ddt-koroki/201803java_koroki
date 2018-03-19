package chap02;

//正の整数値(10～99)をランダムに表示

import java.util.Random;

public class Ensyu2_7_3 {

	public static void main(String[] args) {
		Random rand = new Random();

		int a = rand.nextInt(90) + 10;

		System.out.println("生成された整数は" + a + "です。");

	}

}
