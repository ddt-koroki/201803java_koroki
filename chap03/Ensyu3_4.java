package chap03;

//二つの変数aとbを読み込んで大小関係を表示するプログラム

import java.util.Scanner;

public class Ensyu3_4 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("aの値:");
		double a = x.nextDouble();

		System.out.print("bの値:");
		double b = x.nextDouble();

		if ( a != b)
			if (a > b)
				System.out.println("aの方が大きいです。");
			else
				System.out.println("bの方が大きいです。");
		else
			System.out.println("aとbは同じ値です。");
	}

}
