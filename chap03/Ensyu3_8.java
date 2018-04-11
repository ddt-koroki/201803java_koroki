package chap03;

//キーボードから読み込んだ点数に応じて、結果を表示するプログラム

import java.util.Scanner;

public class Ensyu3_8 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("点数:");
		int a = x.nextInt();

		if (a < 60)
			System.out.println("判定結果は「不可」です。");
		else if (a >= 60 && a < 70)
			System.out.println("判定結果は「可」です。");
		else if (a >= 70 && a <80)
			System.out.println("判定結果は「良」です。");
		else
			System.out.println("判定結果は「優」です。");
	}

}
