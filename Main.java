package Pfc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String k = "kcal";
		String g = "g";
		//徐脂肪体重
		double j1 = 0;
		//摂取可能カロリー
		double s1 = 0;
		//性別
		int s = 0;
		//身長
		int h = 0;

		System.out.println("体重を入力してください。");
		//weight
		double w = new Scanner(System.in).nextInt();
		System.out.println("体脂肪率を入力してください。");
		System.out.println("わからない場合は0を入力してください。");
		//bodyfat
		double b = new Scanner(System.in).nextInt();

		if(b == 0) {
			System.out.println("性別を選んでください。");
			System.out.println("1:Men 2:Women ");
			s = new Scanner(System.in).nextInt();
			System.out.println("身長を入力してください。");
			h = new Scanner(System.in).nextInt();
			if ( s == 1 ) {
//				男性の場合
//				（除脂肪体重）(kg) = 0.32810 * （体重）(kg) + 0.33929 * (身長) (cm) – 29.5336
				j1 = 0.32810 * w + 0.33929 * h - 29.5336;
			}else {
//				女性の場合
//				（除脂肪体重）(kg) = 0.29569 * （体重）(kg) + 0.41813 * (身長) (cm) – 43.2933
				j1 = 0.29569 * w + 0.41813 * h - 43.2933;
			}
		}else {
//		除脂肪体重＝体重-（体重×体脂肪率）
		j1 = w - ( w * (b/100) );
		}

		System.out.println();
		System.out.println("徐脂肪体重:" + (int)j1 + "kg" );

//		摂取可能カロリー＝除脂肪体重×40
		s1 = j1 * 40;
		System.out.println("摂取可能カロリー:" + (int)s1 + k );
		System.out.println();


		//たんぱく質:kcal
		double proKcal = j1 * 2 * 4;
		//P（たんぱく質）＝除脂肪体重×3
		double p1 = j1 * 3;
		System.out.println("タンパク質: " + (int)proKcal + k );
		System.out.println("		: " + (int)p1 + g);
		System.out.println("---------------------");


		//脂質:kcal
		double fat = s1 * 0.15;
		//F（脂質）＝（摂取可能カロリー×0.1）/9
		double f1 = ( s1 * 0.1 ) / 9;
		System.out.println("脂質		: " + (int)fat + k );
		System.out.println("		: " + (int)f1 + g);
		System.out.println("---------------------");

		//糖質:kcal
		double carbo = s1 - (proKcal + fat);
		//C（炭水化物）＝（摂取可能カロリー-P-F）/4
		double c1 = ( s1 - p1 - f1 ) / 4;
		System.out.println("炭水化物	: " + (int)carbo + k );
		System.out.println("		: " + (int)c1 + g);
		System.out.println("---------------------");
		System.out.println("total : " + (int)(proKcal + fat + carbo));
		System.out.println("total : " + (int)(p1 + f1 + c1));


//
//		割合
//		1   2  :  3   :  5
//		2   2  :  2   :  6
//		3  2.5 :  2   : 5.5
//
//		筋肉量
//		FFMI = 体重[kg] x (1 - 体脂肪率/100) ÷ ((身長[m])*(身長[m]))
//		FFMI = 除脂肪体重[kg] ÷ (身長[m])2
//		FFMIの目安
//		18未満：平均以下
//		18〜19.5：平均
//		19.5〜21.0：平均よりも多い
//		21.0〜22.5：とても多い
//		22.5〜26：アスリート並み
//		26〜：ドービングを疑われてしまう
//
//		
//		体脂肪計を使わずに体脂肪率を測定するには、次の方法がおすすめです。
//		（1）自分の標準体重を計算する
//		「標準体重 ＝ 身長（m） × 身長（m） × 22」
//
//		（2）計算した標準体重をもとに、体脂肪率を計算する
//		「体脂肪率 ＝ （実際の体重 − 標準体重） ÷ 標準体重 × 10」
//

//
//
//
//

	}

}
