package kitasoftkoubou_305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		if ((x % 2) == 0)
			System.out.println("偶数です。");
		else
			System.out.println("奇数です。");
	}
}