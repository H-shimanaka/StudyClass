package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Random;

public class PracticeTest6 {

	public static void main(String[] args) {
		//練習問題１
		Random random = new Random();
		int fortune = random.nextInt(5);
		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}

		//練習問題２
		int a = 1;
		int seven = 0;

		do {
			if(a % 7 == 0) {
				System.out.println(a);
				seven += a;
			}
			a++;
		}while(a < 100);
		System.out.println("７の倍数の総合計は" + seven);

		//練習問題３
		for(int i = 1;i <= 9;i++) {

			ArrayList<Integer> numbers = new ArrayList<>();
			for(int x = 1;x <= 9;x++) {
				numbers.add(i*x);
			}
			System.out.println(numbers);
		}

	}

}
