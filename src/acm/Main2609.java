package acm;

import java.util.*;
import java.io.*;

public class Main2609 {
	static List lst = new ArrayList();

	static int gcd(int k, int l) {
		if (l != 0)
			return gcd(l, k % l);
		else
			return k;
	}

	static int lcm(int k, int l) {
		return k / gcd(k, l) * l;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		System.out.println(gcd(a,b));
		System.out.println(lcm(a,b));
	}
}
