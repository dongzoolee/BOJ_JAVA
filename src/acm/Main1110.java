package acm;

import java.util.*;
import java.io.*;

public class Main1110 {
	static List lst = new ArrayList();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), cnt = 0, og = n;

		while (og != n || cnt == 0) {
			n = n % 10 * 10 + (n % 10 + n / 10) % 10;
			cnt++;
		}
		System.out.println(cnt);
	}
}
