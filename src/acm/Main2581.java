package acm;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main2581 {
	static int[] arr = new int[26];
	static int a, b;
	static boolean[] no_prime = new boolean[10001];

	public static void prime() {
		no_prime[1] = true;
		for (int i = 2; i <= b; i++) {
			if (no_prime[i] == false)
				for (int f = i + i; f <= b; f += i) {
					no_prime[f] = true;
				}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		prime();

		int sum = 0;
		for (int i = b; i >= a; i--) {
			if (no_prime[i] == false) {
				sum += i;
			}
		}
		for (int i = a; i <= b; i++) {
			if (no_prime[i] == false) {
				System.out.println(sum);
				System.out.print(i);
				System.exit(0);
			}
		}
		System.out.print(-1);
	}
}
