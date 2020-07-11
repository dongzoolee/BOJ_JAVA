package acm;

import java.util.*;

public class Main2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int f = 0; f < i; f++)
				System.out.print("*");
			System.out.print("\n");
		}

	}
}
