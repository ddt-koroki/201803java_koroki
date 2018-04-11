package chap03;

//List3-5の最後のelseを「else if (n == 0)にした場合の考察

import java.util.Scanner;

public class Ensyu3_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値:");
		int n = stdIn.nextInt();

		if (n > 0)
			System.out.println("その値は正です。");
		else if (n < 0)
			System.out.println("その値は負です。");
		else if (n == 0)
			System.out.println("その値は0です。");

		/*
		【考察結果】
		「n」が「0」であることを判定する式を明示しただけであり、
		前二つのif文で「0」以外の整数値は判定済みである為、実行結果は変わらない。
		*/
	}

}
