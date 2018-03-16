package chap02;

public class SumAve2 {

	public static void main(String[] args) {
		int x, y, z; //xとyとzはint型の変数
		int a;

		x = 25 ; //xに25を代入
		y = 50 ; //yに50を代入
		z = 75 ; //yに75を代入

		System.out.println("xの値は" + x + "、yの値は" + y + "、zの値は" + z + "です。");
		System.out.println("3つの数字の合計は" + (x + y + z) + "です。");
		System.out.println("3つの数字の平均は" + (x + y + z) / 3 + "です。");
	}

}
