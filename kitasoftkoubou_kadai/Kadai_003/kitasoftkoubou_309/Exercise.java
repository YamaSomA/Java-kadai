package kitasoftkoubou_309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("曜日を選択してください");
		System.out.print("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int day = Integer.parseInt(br.readLine());

		System.out.println("時間帯を選択してください");
		System.out.print("0=午前、1=午後、2=夜間");
		int zone = Integer.parseInt(br.readLine());

		boolean bopen = true;

		if (day == 0)
			bopen = false;
		else if (zone == 0 && (day == 2 || day == 5))
			bopen = false;
		else if (zone == 1 && day == 6)
			bopen = false;
		else if (zone == 2 && (day == 3 || day == 6))
			bopen = false;

		if (bopen)
			System.out.println("診療しています。");
		else
			System.out.println("休診です。");
	}
}