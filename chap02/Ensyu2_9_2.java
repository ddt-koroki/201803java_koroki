package chap02;

//0.0以上10.0未満の実数値をランダムに生成して表示

import java.util.Random;

public class Ensyu2_9_2 {

	public static void main(String[] args) {
		Random rand = new Random();

		int a = rand.nextInt(10);
		double b = rand.nextDouble();

		System.out.println("0.0以上10.0未満の実数値を表示します。" + ( a + b ) + "です。");
	}

}
