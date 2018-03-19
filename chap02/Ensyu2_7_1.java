package chap02;

//演習2-7-1:1桁の正の整数(1～9)をランダムで表示

import java.util.Random;

public class Ensyu2_7_1 {

	public static void main(String[] args) {
		Random rand = new Random();

		int random = rand.nextInt(9) + 1;

		System.out.println("生成された整数は" + random + "です。");

	}

}