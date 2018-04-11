package chap02;

//0.0以上1.0未満の実数値をランダムに生成して表示

import java.util.Random;

public class Ensyu2_9_1 {

	public static void main(String[] args) {
		Random rand = new Random();

		double a = rand.nextDouble();

		System.out.println("0.0以上1.0未満の実数値を表示します。" + a + "です。");

	}

}
