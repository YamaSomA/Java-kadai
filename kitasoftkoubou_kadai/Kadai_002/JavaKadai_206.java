package kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("あなたはおいくつですか？");
		int age = Integer.parseInt(br.readLine());

		System.out.println("生まれてから現在まで、およそ" + (age * 365) + "日です");
	}
}