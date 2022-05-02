package jp.co.aforce.practice;

public class PracticeTest5 {

	public static void main(String[] args) {
		//練習問題２
		String[] animals = {"犬","猫","うさぎ","へび"};

		//練習問題３
		int result = 0;
		String favorite = "犬";
		for(int i = 0;i <= 3;i++) {
			if(animals[i].contains(favorite)) {
				result = 1;
			}
		}
		switch(result) {
		case 1:
			System.out.println(favorite + "はリストに含まれています");
			break;
		case 0:
			System.out.println(favorite + "はリストに含まれていません");
			break;
		}

		//練習問題４
		int Month = 5;
		if(Month == 1) {
			System.out.println("元日、成人の日");
		}else if(Month == 2) {
			System.out.println("建国記念の日、天皇誕生日");
		}else if(Month == 3) {
			System.out.println("春分の日");
		}else if(Month == 4) {
			System.out.println("昭和の日");
		}else if(Month == 5) {
			System.out.println("憲法記念日、みどりの日、こどもの日");
		}else if(Month == 7) {
			System.out.println("海の日、スポーツの日");
		}else if(Month == 8) {
			System.out.println("山の日");
		}else if(Month == 9) {
			System.out.println("敬老の日、秋分の日");
		}else if(Month == 11) {
			System.out.println("文化の日、勤労感謝の日");
		}else {
			System.out.println("なし");
		}

	}

}
