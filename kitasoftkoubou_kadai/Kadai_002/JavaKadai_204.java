package kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		System.out.println("和" + (x + y));
		System.out.println("差" + (x - y));
		System.out.println("積" + (x * y));
		System.out.println("商" + (x / y));
		System.out.println("余り" + (x % y));
	}
}