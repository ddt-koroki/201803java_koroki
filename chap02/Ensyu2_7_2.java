package chap02;

//演習2-7-2:1桁の負の整数をランダムで表示

import java.util.Random;

public class Ensyu2_7_2 {

	public static void main(String[] args) {
		Random rand = new Random();

		int a = rand.nextInt(9) + 1;

		int fusu = -a;

		System.out.println("生成された負の整数は" + fusu + "です。");

	}

}
